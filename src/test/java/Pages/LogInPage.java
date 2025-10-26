package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {

    WebDriver driver;
    @FindBy(id = "login-heading")
    WebElement LogInPageHeader_id;

    @FindBy(id ="login-email")
    WebElement EmailAddress_id;

    @FindBy(id ="login-password")
    WebElement Password_id;

    @FindBy(id ="login-submit")
    WebElement LogIn_Button_id;

    public LogInPage (WebDriver driver){
        this.driver=driver;
    }

    public void verifyLogInPageIsDisplayed(){LogInPageHeader_id.isDisplayed();}
    public void enterEmailAddress(){EmailAddress_id.sendKeys("magendani01@gmail.com");}
    public void enterPassword(){Password_id.sendKeys("LeLa@190301");}
    public void clickLogInButton(){LogIn_Button_id.click();}
}
