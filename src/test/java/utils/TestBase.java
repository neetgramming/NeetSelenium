package utils;

import com.neetgramming.pages.BasePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase extends BasePage {
    @BeforeClass
    public void browserSetup(){
        System.out.println("running browser setup");
        setupBrowser();
    }

    @AfterClass
    public void tearDown() {
        System.out.println("running teardown");
        quitBrowser();
    }
}
