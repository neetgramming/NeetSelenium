package com.neetgramming.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    private By btnSignin = By.xpath("//*[text()='Sign in']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }

    public String getHomeCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public boolean isSignInAvailable() {
        return driver.findElement(btnSignin).isDisplayed();
    }
}
