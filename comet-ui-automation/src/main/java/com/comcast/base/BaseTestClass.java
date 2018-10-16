package com.comcast.base;

import com.comcast.SeleniumUtils;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTestClass {

    protected ChromeDriver chromeDriver;

    @Before
    public void setUp() throws Exception {
        chromeDriver = SeleniumUtils.getDriver();
    }

}
