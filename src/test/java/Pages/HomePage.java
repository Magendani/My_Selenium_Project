package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;

    @FindBy(id = "overview-hero")
    WebElement homepageHeading_id;

    @FindBy(id = "nav-btn-practice")
    WebElement learningMaterialsButton_id;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHomePageIsDisplayed() {homepageHeading_id.isDisplayed();}
    public void clickLearningMaterialsButton() {learningMaterialsButton_id.click();}




}