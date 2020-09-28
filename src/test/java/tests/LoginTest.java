package tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class LoginTest extends BaseTest{

    private String email = "admin@phptravels.com";
    private String password = "demoadmin";
    private HomePage homePage;

    @Test
    @Description("Test case verifies login functionality")
    @Severity(SeverityLevel.NORMAL)
    @Epic("Login")
    @TmsLink("https://jira.com")
    @Issue("https://jira.com/issue-2547")
    public void test() {
        homePage = loginPage.loginAs(email, password);
        Assert.assertTrue(homePage.isViewWebsiteButtonDisplayed(),
                "Login is not successful");
    }

}
