package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class LoginTest extends BaseTest{

    private String email = "admin@phptravels.com";
    private String password = "demoadmin";
    private HomePage homePage;
    @Test
    public void test() {
        homePage = loginPage.loginAs(email, password);
        Assert.assertTrue(homePage.isViewWebsiteButtonDisplayed(),
                "Login is not successful");
    }

}
