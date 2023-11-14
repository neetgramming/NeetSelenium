package com.neetgramming.tests;

import com.neetgramming.pages.HomePage;
import com.neetgramming.utils.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomeTests extends TestBase {
    private HomePage homePage;
    private String homeTitle;
    private String currentTitle;
    private boolean isSignInAvailable;

    @BeforeClass(groups = {"regression", "smoke", "functional"})
    public void initClass() {
        homePage = new HomePage(driver);
    }

    @Test(testName = "verifyTitle", priority = 2, groups = {"functional"})
    public void test_verifyTitle() {
        homeTitle = homePage.getHomePageTitle();
        Assert.assertEquals(homeTitle, "Google", "Incorrect home title");
    }

    @Test(testName = "verifyCurrentURL", priority = 1, groups = {"functional"})
    public void test_verifyCurrentUrl() {
        currentTitle = homePage.getHomeCurrentUrl();
        Assert.assertEquals(currentTitle, "https://google.net", "Incorrect current url");
    }

    @Test(testName = "verifySignInBtn", priority = 3, groups = {"regression", "functional"})
    public void test_verifySignInBtn() {
        isSignInAvailable = homePage.isSignInAvailable();
        Assert.assertTrue(isSignInAvailable, "No option to sign in");
    }

    @Test(testName = "verifyGoogleHomePage", groups = {"regression", "smoke"})
    public void test_verifyGoogleHome() {
        currentTitle = homePage.getHomeCurrentUrl();
        homeTitle = homePage.getHomePageTitle();
        isSignInAvailable = homePage.isSignInAvailable();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(currentTitle, "https://www.google.com/", "Incorrect current url");
        softAssert.assertEquals(homeTitle, "Google", "Incorrect home title");
        softAssert.assertTrue(isSignInAvailable, "No option to sign in");
        softAssert.assertAll();
    }
}
