package com.comcast.checkers;

import com.comcast.SeleniumUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.comcast.SeleniumUtils.getPath;

@Slf4j
public class ChartAvailableChecker extends BaseChecker {

    public static boolean performCheck(int expectedCount) {
        boolean result = false;
        int chartCount = 0;
        try {
            List<WebElement> svgList = driver.findElementsByTagName("svg");
            for (WebElement svgElement : svgList) {
                String labelAttribute = svgElement.getAttribute("aria-label");
                if (StringUtils.equals(labelAttribute, "A chart.")) {
                    chartCount++;
                }
            }
            if (chartCount == expectedCount) {
                log.info("Check succeed, path={}", getPath());
                result = true;
            } else {
                log.error("Check failed, expected={}, found={}, path={}", expectedCount, chartCount, getPath());
                result = false;
            }
        } catch (Exception e) {
            log.warn("Exception during checking url={}", getPath(), e);
            result = false;
        }
        return result;
    }
}
