package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {
    @FindBy(xpath = "//button[contains(text(), 'View Website')]")
    private List<WebElement> viewWebsiteButtons;
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public boolean isViewWebsiteButtonDisplayed() {
        return viewWebsiteButtons.size() > 0;
    }
}
