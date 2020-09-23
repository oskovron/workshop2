package tests;

import core.WebDriverFactory;
import enums.BrowserEnum;
import enums.EnvironmentEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pageobjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    @BeforeClass
    @Parameters({"browser", "browserVersion", "environment"})
    public void setup(BrowserEnum browser, String browserVersion, EnvironmentEnum environment) {
        driver = WebDriverFactory.getDriver(browser, browserVersion, environment);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.phptravels.net/admin/");
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
