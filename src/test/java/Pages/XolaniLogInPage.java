package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class XolaniLogInPage {

    WebDriver driver;
    @FindBy(id = "login-heading")
    WebElement logInPage_id;

    @FindBy(id = "login-email")
    WebElement emailAddress_id;

    @FindBy(id = "login-password")
    WebElement password_id;

    @FindBy(id = "login-submit")
    WebElement logInButton_id;

    public XolaniLogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLogInPageIsDisplayed() {
        logInPage_id.isDisplayed();
    }

    public void enterEmailAddress(String email) {
        new WebDriverWait(driver, Duration.ofSeconds(8)).until(visibilityOf(emailAddress_id));
        emailAddress_id.sendKeys(email);
    }

    public void enterPassword(String password) {
        emailAddress_id.sendKeys(password);
    }

    public void clickLogInButton() {
        logInButton_id.click();
    }

}
