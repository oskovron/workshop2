package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath = "//*[@name='email' and not(@id)]")
    private WebElement emailInput;
    @FindBy(xpath = "//*[@name='password']")
    private WebElement passwordInput;
    @FindBy(xpath = "//*[text()='Login']")
    private WebElement loginButton;
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage loginAs(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        return clickLogin();
    }
    private void enterEmail(String email) {
        emailInput.sendKeys(email);
    }
    private void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }
    private HomePage clickLogin() {
        loginButton.click();
        return PageFactory.initElements(driver, HomePage.class);
    }

}
