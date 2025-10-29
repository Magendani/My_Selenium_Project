package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class XolaniWebAutomationAdvancePage {

    WebDriver driver;
    @FindBy(id="inventory-title")
    WebElement inventoryFormTitle_id;

    @FindBy(id="deviceType")
    WebElement deviceTypeHead_id;

    @FindBy(xpath = "//*[@id=\"deviceType\"]/option[2]")
    WebElement deviceSelect_id;

    @FindBy(id="brand")
    WebElement cellphoneBrand_id;

    @FindBy(id="device-preview")
    WebElement cellphonePreview_id;

    @FindBy(id="storage-256GB")
    WebElement cellphoneStorage_id;

    @FindBy(id="color")
    WebElement cellphoneColorDropdown_id;

    @FindBy(id="//*[@id=\"color\"]/option[3]")
    WebElement cellphoneColor_id;


    public XolaniWebAutomationAdvancePage(WebDriver driver) {
    }

    public void verifyInventoryFormTitleIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(6)).until(visibilityOf(inventoryFormTitle_id));
        inventoryFormTitle_id.isDisplayed();}

    public void clickDeviceTypeHead_id(){
        deviceTypeHead_id.click();
    }

    public void selectDevice(String deviceType){
        deviceSelect_id.click();
    }
    public void selectBrand(String cellphoneBrand){
        cellphoneBrand_id.click();
    }

    public void cellphonePreview(String CellphonePreview){
        cellphonePreview_id.isDisplayed(); }

    public void selectCellphoneStorage(String CellphoneStorage){
       cellphoneStorage_id.click();}

    public void clickCellphoneColorDropdown(String cellphoneColorDropdown){
        WebElement CellphoneColorDropdown_id;
        cellphoneColorDropdown_id.click();
    }

    public void selectCellphoneColor(String CellphoneColor){
        cellphoneColor_id.click();
    }

}
