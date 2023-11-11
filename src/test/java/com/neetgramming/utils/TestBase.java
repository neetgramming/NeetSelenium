package com.neetgramming.utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.apache.log4j.Logger;

public class TestBase extends BrowserUtil {
    protected static WebDriver driver;
    private static final String BASE_URL = "https://google.com";
    private static final Logger log = Logger.getLogger(TestBase.class);

    @BeforeTest
    public static void browserSetup(){
        log.info("setting up browser & navigating to "+BASE_URL);
        driver = setupBrowser();
        goToBaseURL(driver, BASE_URL);
    }

    @AfterTest
    public static void quitBrowser() {
        log.info("quitting browser");
        quitBrowser(driver);
    }
}
