package com.neetgramming.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasePage {
    private static WebDriver driver;
    private static final String BASE_URL = "https://google.com";

    public static void setupBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void quitBrowser() {
        driver.quit();
    }

    public static void closeBrowser() {
        driver.close();
    }
}
