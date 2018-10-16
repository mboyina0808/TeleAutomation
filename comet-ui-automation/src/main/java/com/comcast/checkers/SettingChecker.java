package com.comcast.checkers;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.comcast.SeleniumUtils.getPath;

@Slf4j
public class SettingChecker extends BaseChecker {

    public static boolean performCheck(String settingName, String expectedValue) {
        boolean result = false;
        boolean elementFound = false;
        String actualValue = null;
        try {
            List<WebElement> selectList = driver.findElementsByTagName("select");
            for (WebElement selectElement : selectList) {
                String selectId = selectElement.getAttribute("id");
                if (StringUtils.contains(selectId, settingName)) {
                    elementFound = true;
                    Select select = new Select(selectElement);
                    actualValue = select.getFirstSelectedOption().getText();
                    result = StringUtils.equals(expectedValue, actualValue);
                }
            }

        } catch (Exception e) {
            log.warn("Exception during checking url={}", getPath(), e);
            result = false;
        }
        if (elementFound) {
            if (result) {
                log.info("Check succeed, path={}", getPath());
            } else {
                log.error("Check failed, expectedValue={}, actualValue={}, path={}", expectedValue, actualValue, getPath());
            }
        } else {
            log.error("Check failed, target setting not found, settingName={}, path={}", settingName, getPath());
        }
        return result;
    }
}
