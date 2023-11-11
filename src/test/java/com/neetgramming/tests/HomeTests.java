package com.neetgramming.tests;

import com.neetgramming.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.neetgramming.utils.TestBase;

public class HomeTests extends TestBase {
    private HomePage homePage;
    private String homeTitle;
    private String currentTitle;
    private boolean isSignInAvailable;
    @BeforeClass
    public void initDriver() {
        homePage = new HomePage(driver);
    }

    @Test(testName = "verifyTitle", priority = 2)
    public void test_verifyTitle() {
        homeTitle = homePage.getHomePageTitle();
        Assert.assertEquals(homeTitle, "Google", "Incorrect home title");
    }

    @Test(testName = "verifyCurrentURL", priority = 1)
    public void test_verifyCurrentUrl() {
        currentTitle = homePage.getHomeCurrentUrl();
        Assert.assertEquals(currentTitle, "https://google.net", "Incorrect current url");
    }

    @Test(testName = "verifySignInBtn", priority = 3)
    public void test_verifySignInBtn() {
        isSignInAvailable = homePage.isSignInAvailable();
        Assert.assertTrue(isSignInAvailable, "No option to sign in");
    }

    @Test(testName = "verifyGoogleHomePage")
    public void test_verifyGoogleHome() {
        currentTitle = homePage.getHomeCurrentUrl();
        homeTitle = homePage.getHomePageTitle();
        isSignInAvailable = homePage.isSignInAvailable();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(currentTitle, "https://google.net", "Incorrect current url");
        softAssert.assertEquals(homeTitle, "Google", "Incorrect home title");
        softAssert.assertTrue(isSignInAvailable, "No option to sign in");
        softAssert.assertAll();
    }
}
