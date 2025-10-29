package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class XolaniLearningMaterialsPage {

    WebDriver driver;

    @FindBy(id= "practice-heading")
    WebElement welcomeMessage_id;

    @FindBy(id= "tab-btn-web")
    WebElement webAutoAdvanceTab_id;

    public XolaniLearningMaterialsPage(WebDriver driver) {this.driver= driver;}

    public void verifyHeading(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(welcomeMessage_id));}

    public void clickWebAutoAdvanceTab() {webAutoAdvanceTab_id.click();}

}
