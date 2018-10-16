package com.comcast.checkers;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.comcast.SeleniumUtils.getPath;

@Slf4j
public class OptionsCountChecker extends BaseChecker {

    public static boolean performCheck(String settingName, int expectedAtLeastCount) {
        boolean result = false;
        boolean elementFound = false;
        int actualCount = 0;
        try {
            List<WebElement> selectList = driver.findElementsByTagName("select");
            for (WebElement selectElement : selectList) {
                String selectId = selectElement.getAttribute("id");
                if (StringUtils.contains(selectId, settingName)) {
                    elementFound = true;
                    Select select = new Select(selectElement);
                    actualCount = select.getOptions().size();
                }
            }

        } catch (Exception e) {
            log.warn("Exception during checking url={}", getPath(), e);
        }
        if (elementFound) {
            if (actualCount >= expectedAtLeastCount) {
                log.info("Check succeed, expectedAtLeast={}, actualValue={}, path={}", expectedAtLeastCount, actualCount, getPath());
                result = true;
            } else {
                log.error("Check failed, expectedAtLeast={}, actualValue={}, path={}", expectedAtLeastCount, actualCount, getPath());
            }
        } else {
            log.error("Check failed, target setting not found, settingName={}, path={}", settingName, getPath());
        }
        return result;
    }
}
