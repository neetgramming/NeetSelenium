package tests;

import com.neetgramming.pages.HomePage;
import org.testng.annotations.Test;
import utils.TestBase;

public class HomeTests extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void testMethod() {
        homePage.launchHomePage();
    }
}
