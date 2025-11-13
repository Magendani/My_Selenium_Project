package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class XolaniWebAutomationAdvancePage {

    WebDriver driver;

    @FindBy(id = "practice-heading")
    WebElement welcomeMessage_id;

    @FindBy(id = "tab-btn-web")
    WebElement webAutomationAdvanceButton_id;

    @FindBy(id = "inventory-title")
    WebElement inventoryFormTitle_id;

    @FindBy(id = "deviceType")
    WebElement deviceTypeHead_id;

    @FindBy(id = "brand")
    WebElement deviceSelect_id;

    @FindBy(id = "brand")
    WebElement cellphoneBrand_id;

    @FindBy(id = "device-preview")
    WebElement cellphonePreview_id;

    @FindBy(id = "storage-256GB")
    WebElement cellphoneStorage_id;

    @FindBy(id = "color")
    WebElement cellphoneColorDropdown_id;

    @FindBy(id = "color")
    WebElement cellphoneColor_id;

    @FindBy(id = "quantity")
    WebElement cellphoneQuantity_id;

    @FindBy(id = "address")
    WebElement deliveryAddress_id;

    @FindBy(id = "inventory-next-btn")
    WebElement clickNextButton_id;

    @FindBy(id = "shipping-option-express")
    WebElement expressRadioButton_id;

    @FindBy(id = "warranty-option-1yr")
    WebElement warrantyRadioButton_id;

    @FindBy(id = "discount-code")
    WebElement discountFee_id;

    @FindBy(id = "apply-discount-btn")
    WebElement discountButton_id;

    @FindBy(id="add-to-cart-btn")
    WebElement addToCartButton_id;

    @FindBy(id="deviceType")
    WebElement deviceSelection_id;

    @FindBy(id="brand")
    WebElement brandTypeSelection_id;

    @FindBy(id="storage-128GB")
    WebElement laptopStorage_id;

    @FindBy(id="color")
    WebElement laptopColor_id;

    @FindBy(id="quantity")
    WebElement laptopQuantity_id;

    public XolaniWebAutomationAdvancePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyWelcomeMessageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(14)).until(visibilityOf(welcomeMessage_id));
        welcomeMessage_id.isDisplayed();
    }

    public void clickWebAutomationAdvanceButton() {
        webAutomationAdvanceButton_id.click();
    }

    public void verifyInventoryFormTitleIsDisplayed() {
        inventoryFormTitle_id.isDisplayed();
    }

    public void clickDeviceTypeDropdown() {
    }

    public void selectDevice(String deviceType) {

        deviceTypeHead_id.sendKeys(deviceType);
    }

    public void selectBrand(String cellphoneBrand) {

        cellphoneBrand_id.sendKeys(cellphoneBrand);
    }

    public void previewCellphone() {
        cellphonePreview_id.isDisplayed();
    }

    public void selectCellphoneStorage() {

        cellphoneStorage_id.click();
    }

    public void clickCellphoneColorDropdown() {

        cellphoneColorDropdown_id.click();
    }

    public void selectCellphoneColor(String cellphoneColor) {
        cellphoneColor_id.sendKeys(cellphoneColor);
    }

    public void selectQuantity(String cellphoneQuantity) {
        cellphoneQuantity_id.clear();
        cellphoneQuantity_id.sendKeys(cellphoneQuantity);
    }

    public void typeDeliveryAddress(String deliveryAddress) {
        deliveryAddress_id.sendKeys(deliveryAddress);
    }

    public void clickNextButton() {
        clickNextButton_id.click();
    }

    public void clickExpressRadioButton() {
        expressRadioButton_id.click();
    }

    public void clickWarrantyRadioButton() {
        warrantyRadioButton_id.click();
    }

    public void enterDiscountFee(String discountFee) {
        discountFee_id.sendKeys(discountFee);
    }

    public void clickApplyButton() {
        discountButton_id.click();
    }

    public void clickAddToCartButton(){
       addToCartButton_id.click();
    }

    public void deviceSelection(String deviceSelection )  {
        deviceSelection_id.sendKeys( deviceSelection);
    }

    public void brandSelection(String brandTypeSelection){
        brandTypeSelection_id.sendKeys(brandTypeSelection);
    }

    public void clickStorageSize(){
        laptopStorage_id.click();
    }

    public void selectLaptopColor( String laptopColor){
        laptopColor_id.sendKeys(laptopColor);
    }

    public void selectLaptopQuantity(String laptopQuantity){
        laptopQuantity_id
    }
}
