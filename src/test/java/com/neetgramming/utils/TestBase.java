package com.neetgramming.utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase extends BrowserUtil {
    private static final String BASE_URL = "https://google.com";
    private static final Logger log = Logger.getLogger(TestBase.class);
    protected static WebDriver driver;

    @Parameters("browserName")
    @BeforeTest(groups = {"regression", "smoke", "functional"})
    public void browserSetup(@Optional String browserName) {
        log.info("setting up browser & navigating to " + BASE_URL);
        driver = setupBrowser(browserName);
        goToBaseURL(driver, BASE_URL);
    }

    @AfterTest(groups = {"regression", "smoke", "functional"})
    public void quitBrowser() {
        log.info("quitting browser");
        quitBrowser(driver);
    }
}
