package Testa;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class XolaniTests extends XolaniBase {
    @Test(priority = 1)
    public void verifyHomePageIsDisplayedTests() {
        xolanihomePage.verifyHomePageIsDisplayed();
    }


    @Test(priority = 2)
    //@Test(dependsOnMethods = "verifyHomePageIsDisplayedTests")
    public void clickLearningMaterialsButtonTests() {
        xolanihomePage.clickLearningMaterialsButton();
    }

    @Test(priority = 3)
    //@Test(dependsOnMethods = "clickLearningMaterialsButtonTests")
    public void verifyLogInPageIsDisplayedTests() {
        xolaniLogInPage.verifyLogInPageIsDisplayed();
    }

    @Test(priority = 4)
    //@Test(dependsOnMethods ="verifyLogInPageIsDisplayedTests")
    public void invalidPasswordTest() {
        xolaniLogInPage.enterEmailAddress("magendani01@gmail.com");
        xolaniLogInPage.enterPassword("Lela@19030");
        xolaniLogInPage.clickLogInButton();
        // xolaniLogInPage.verifyLogInPageIsDisplayed();
        xolaniLogInPage.handleAlert();
//        xolaniLogInPage.enterPassword("LeLa@190301");
//        xolaniLogInPage.clickLogInButton();
    }

    @Test(priority = 5)
    //@Test(dependsOnMethods ="invalidPasswordTest")
    public void validLoginCredentialsTest() {

        xolaniLogInPage.enterEmailAddress("magendani01@gmail.com");
        xolaniLogInPage.enterPassword("LeLa@190301");
        xolaniLogInPage.clickLogInButton();
//        xolaniLearningMaterialsPage.verifyHeading();
    }


//    @AfterTest
//    public void closeBrowser () {
//        driver.close();
//    }
    //@Test(priority = 6)
     @Test(dependsOnMethods = "clickLearningMaterialsButtonTests")
    public void enterEmailAddressTests() {
        xolaniLogInPage.enterEmailAddress("magendani01@gmail.com");
    }

    @Test(dependsOnMethods = "enterEmailAddressTests")
    public void enterPasswordTests()  {
        xolaniLogInPage.enterPassword("LeLa@190301");
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLogInButtonTests() {
        xolaniLogInPage.clickLogInButton();
    }

    @Test(dependsOnMethods = "clickLogInButtonTests")
    public void verifyWelcomeMessageIsDisplayedTests() {
        xolaniWebAutomationAdvancePage.verifyWelcomeMessageIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyWelcomeMessageIsDisplayedTests")
    public void clickWebAutomationAdvanceTabTests() {
        xolaniWebAutomationAdvancePage.clickWebAutomationAdvanceButton();
    }

    @Test(dependsOnMethods = "clickWebAutomationAdvanceTabTests")
    public void verifyInventoryFormTitleIsDisplayedTests() {
        xolaniWebAutomationAdvancePage.verifyInventoryFormTitleIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyInventoryFormTitleIsDisplayedTests")
    public void clickDeviceTypeDropdownTests() {

        xolaniWebAutomationAdvancePage.clickDeviceTypeDropdown();
    }

    @Test(dependsOnMethods = "clickDeviceTypeDropdownTests")
    public void selectDeviceTest() throws InterruptedException {

        xolaniWebAutomationAdvancePage.selectDevice("Phone");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "selectDeviceTest")
    public void selectBrandTests() throws InterruptedException {

        xolaniWebAutomationAdvancePage.selectBrand("Xiaomi");
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "selectBrandTests")
    public void previewCellphoneTest() {

        xolaniWebAutomationAdvancePage.previewCellphone();
    }

    @Test(dependsOnMethods = "previewCellphoneTest")
    public void selectCellphoneStorageTest() throws InterruptedException {

        xolaniWebAutomationAdvancePage.selectCellphoneStorage();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "selectCellphoneStorageTest")
    public void clickCellphoneColorDropdownTest() {

        xolaniWebAutomationAdvancePage.clickCellphoneColorDropdown();
    }

    @Test(dependsOnMethods = "clickCellphoneColorDropdownTest")
    public void selectCellphoneColorTest() throws InterruptedException {

        xolaniWebAutomationAdvancePage.selectCellphoneColor("Blue");
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "selectCellphoneColorTest")
    public void selectQuantityTest() throws InterruptedException {
        xolaniWebAutomationAdvancePage.selectQuantity("2");
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "selectQuantityTest")
    public void deliveryAddressTest() throws InterruptedException {
        xolaniWebAutomationAdvancePage.typeDeliveryAddress("Umlazi, Durban");
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "deliveryAddressTest")
    public void clickNextButtonTest() throws InterruptedException {
        xolaniWebAutomationAdvancePage.clickNextButton();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickNextButtonTest")
    public void expressRadioButtonTest() throws InterruptedException {
        xolaniWebAutomationAdvancePage.clickExpressRadioButton();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "expressRadioButtonTest")
    public void warrantyRadioButtonTest() throws InterruptedException {
        xolaniWebAutomationAdvancePage.clickWarrantyRadioButton();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "warrantyRadioButtonTest")
    public void discountFeeTest() throws InterruptedException {
        xolaniWebAutomationAdvancePage.enterDiscountFee("SAVE20");
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "discountFeeTest")
    public void discountButtonTest() throws InterruptedException {
        xolaniWebAutomationAdvancePage.clickApplyButton();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "discountButtonTest")
    public void addToCartButtonTest() throws InterruptedException {
        xolaniWebAutomationAdvancePage.clickAddToCartButton();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "addToCartButtonTest")
    public void deviceSelectionTest() throws InterruptedException {
        xolaniWebAutomationAdvancePage.selectDevice("laptop");
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "deviceSelectionTest")
    public void brandTypeSelectionTest() throws InterruptedException {
        xolaniWebAutomationAdvancePage.brandSelection("macbook air");
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "brandTypeSelectionTest")
    public void laptopStorageTest() throws InterruptedException {
        xolaniWebAutomationAdvancePage.clickStorageSize();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "laptopStorageTest")
    public void laptopColorTest() throws InterruptedException {
        xolaniWebAutomationAdvancePage.selectLaptopColor("black");
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "laptopColorTest")
    public void laptopQuantityTest() {
        xolaniWebAutomationAdvancePage.selectLaptopQuantity("1");
    }

    @Test(dependsOnMethods = "laptopQuantityTest")
    public void laptopDeliveryAddressTest() {
        xolaniWebAutomationAdvancePage.typeLaptopDeliveryAddress("Umlazi, Durban");
    }

    @Test(dependsOnMethods = "laptopDeliveryAddressTest")
    public void nextButtonTest() {
        xolaniWebAutomationAdvancePage.clickNxtButton();
    }

    @Test(dependsOnMethods = "nextButtonTest")
    public void expressButtonTest() {
        xolaniWebAutomationAdvancePage.clickShippingMethod();
    }

    @Test(dependsOnMethods = "expressButtonTest")
    public void warrantyButtonTest() {
        xolaniWebAutomationAdvancePage.selectWarrantyYear();
    }

    @Test(dependsOnMethods = "warrantyButtonTest")
    public void enterDiscountFeeTest() {
        xolaniWebAutomationAdvancePage.typeDiscountFee("SAVE10");
    }

    @Test(dependsOnMethods = "enterDiscountFeeTest")
    public void pressApplyButtonTest() {
        xolaniWebAutomationAdvancePage.pressApplyButton();
    }

    @Test(dependsOnMethods = "pressApplyButtonTest")
    public void clickAddToCartButton2Test() {
        xolaniWebAutomationAdvancePage.clickAddToCartButton2();
    }

    @Test(dependsOnMethods = "clickAddToCartButton2Test")
    public void clickReviewOrderCartButtonTest() {
        xolaniWebAutomationAdvancePage.clickReviewOrderCartButton();
    }

    @Test(dependsOnMethods = "clickReviewOrderCartButtonTest")
    public void clickPlaceOrderButtonTest() {
        xolaniWebAutomationAdvancePage.clickPlaceOrderButton();
    }

    @Test(dependsOnMethods = "clickPlaceOrderButtonTest")
    public void successfulOrderMessageTest() throws InterruptedException {
        xolaniWebAutomationAdvancePage.displayOrderMessagePopUp();
    }

    @Test(dependsOnMethods = "successfulOrderMessageTest")
    public void viewInvoiceButtonTest() throws InterruptedException {
        xolaniInvoicePage.clickViewInvoiceButton();
    }

    @Test(dependsOnMethods = "viewInvoiceButtonTest")
    public void viewInvoiceHistoryButtonTest() throws InterruptedException {
        xolaniInvoicePage.clickInvoiceHistoryButton();
    }

    @Test(dependsOnMethods = "viewInvoiceHistoryButtonTest")
    public void saveAsPdfButtonTest() {
        xolaniInvoicePage.clickSaveAsPdfButton();
    }



}

//    @Test(dependsOnMethods = "saveAsPdfButtonTest")
//    public void clearAllInvoiceButtonTest() {
//        .clickClearAllInvoiceButton();


//    @Test(dependsOnMethods = "clearAllInvoiceButtonTest")
//    public void closeInvoicePageTest() {
//        xolaniWebAutomationAdvancePage.clickCloseInvoicePageIcon();
//    }


//}


