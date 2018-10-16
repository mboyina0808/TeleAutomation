package com.comcast;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.chrome.ChromeDriver;

@Slf4j
public class SeleniumUtils {

    private static ChromeDriver chromeDriver = new ChromeDriver();
    private static final ThreadLocal<String> pathHolder = new ThreadLocal<>();

    public static void setPath(String path) {
        pathHolder.set(path);
    }

    public static String getPath() {
        return pathHolder.get();
    }

    public static ChromeDriver getDriver() {
        return chromeDriver;
    }

    public static ChromeDriver performQuery(String path) {

        try {
            chromeDriver.get("http://localhost:21432");
            Thread.sleep(100);
            chromeDriver.get(getFullCometUrl(path));
            pathHolder.set(path);
            Thread.sleep(10000);
        } catch (Exception e) {
            log.info("Can't perform query", e);
        }
        return chromeDriver;
    }

    public static String getBaseCometUrl() {
        return System.getProperty("comet.url");
    }

    public static String getFullCometUrl(String path) {
        return getBaseCometUrl() + path;
    }


}
