package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(emailAddress_id));
        emailAddress_id.clear();
        emailAddress_id.sendKeys(email);
    }

    public void enterPassword(String password) {
       new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(password_id));
        password_id.clear();
        password_id.sendKeys(password);
    }

    public void clickLogInButton() {
        new WebDriverWait(driver, Duration.ofSeconds(40)).until(visibilityOf(logInButton_id));
        logInButton_id.click();
    }

    public void handleAlert(){ // Wait for alert to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

// Switch to alert
        Alert alert = driver.switchTo().alert();

// Click OK
        alert.accept();}

    public void closeBrowser() {

    }
}
