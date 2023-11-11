package com.neetgramming.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import org.apache.log4j.Logger;

public class BrowserUtil {
    private static WebDriver driver;
    private static final Logger log = Logger.getLogger(BrowserUtil.class);

    public static WebDriver setupBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        log.trace("Method: " + Thread.currentThread().getStackTrace()[1].getMethodName() + "\n driver: " + driver);
        return driver;
    }

    public static void goToBaseURL(WebDriver driver, String baseURL){
        driver.get(baseURL);
    }

    public static void quitBrowser(WebDriver driver) {
        driver.quit();
        log.trace("Method: " + Thread.currentThread().getStackTrace()[1].getMethodName() + "\n driver: " + driver);
    }

    public static void closeBrowser(WebDriver driver) {
        driver.close();
        log.trace("Method: " + Thread.currentThread().getStackTrace()[1].getMethodName() + "\n driver: " + driver);
    }
}
