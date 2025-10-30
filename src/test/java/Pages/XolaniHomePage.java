package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class XolaniHomePage {

    WebDriver driver;

    @FindBy(id = "overview-hero")
    WebElement homepageHeading_id;

    @FindBy(id = "nav-btn-practice")
    WebElement learningMaterialsButton_id;

    public XolaniHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHomePageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(homepageHeading_id));
    }

    public void clickLearningMaterialsButton() {
        learningMaterialsButton_id.click();
    }
}