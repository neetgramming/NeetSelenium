package com.neetgramming.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class BrowserUtil {
    private static final Logger log = Logger.getLogger(BrowserUtil.class);
    private static WebDriver driver;

    public static WebDriver setupBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        log.trace("Method: " + Thread.currentThread().getStackTrace()[1].getMethodName() + "\n driver: " + driver);
        return driver;
    }

    public static WebDriver setupBrowser(String browserName) {
        if (browserName == null)
            setupBrowser();
        else {
            switch (browserName) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + browserName);
            }
        }
        driver.manage().window().maximize();
        log.trace("Method: " + Thread.currentThread().getStackTrace()[1].getMethodName() + "\n driver: " + driver);
        return driver;
    }

    public static void goToBaseURL(WebDriver driver, String baseURL) {
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
