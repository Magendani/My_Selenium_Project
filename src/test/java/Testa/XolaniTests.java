package Testa;

import org.testng.annotations.Test;

public class XolaniTests extends XolaniBase {
    @Test
    public void verifyHomePageIsDisplayedTests() {
        xolanihomePage.verifyHomePageIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyHomePageIsDisplayedTests")
    public void clickLearningMaterialsButtonTests() {
        xolanihomePage.clickLearningMaterialsButton();
    }
    @Test(dependsOnMethods = "clickLearningMaterialsButtonTests")
    public void verifyLogInPageIsDisplayedTests() {
        xolaniLogInPage.verifyLogInPageIsDisplayed();
    }

    @Test(dependsOnMethods = "clickLearningMaterialsButtonTests")
    public void enterEmailAddressTests() {
        xolaniLogInPage.enterEmailAddress("magendani01@gmail.com");
    }
    @Test(dependsOnMethods ="enterEmailAddressTests")
    public void enterPasswordTests() {
        xolaniLogInPage.enterPassword("LeLa@190301");
    }
    @Test(dependsOnMethods="enterPasswordTests")
    public void clickLogInButton() {
        xolaniLogInPage.clickLogInButton();
    }
    @Test(dependsOnMethods="clickLogInButton")
    public void verifyWelcomeMessageIsDisplayedTests() {
        xolaniWebAutomationAdvancePage.verifyWelcomeMessageIsDisplayed();
    }
    @Test(dependsOnMethods="verifyWelcomeMessageIsDisplayedTests")
    public void clickWebAutomationAdvanceTabTests() {
        xolaniWebAutomationAdvancePage.clickWebAutomationAdvanceButton();
    }
    @Test(dependsOnMethods = "clickWebAutomationAdvanceTabTests")
    public void verifyInventoryFormTitleIsDisplayedTests() {
        xolaniWebAutomationAdvancePage.verifyInventoryFormTitleIsDisplayed();
    }
    @Test(dependsOnMethods="verifyInventoryFormTitleIsDisplayedTests")
    public void clickDeviceTypeDropdownTests() {
        xolaniWebAutomationAdvancePage.clickDeviceTypeDropdown();
    }
    @Test(dependsOnMethods="clickDeviceTypeDropdownTests")
    public void selectDeviceTest(String deviceType) {
        xolaniWebAutomationAdvancePage.selectDevice(deviceType);
    }
    @Test(dependsOnMethods="selectDeviceTest")
    public void selectBrandTests() {
        xolaniWebAutomationAdvancePage.selectBrand("Xiaomi");
    }
    @Test(dependsOnMethods="selectBrandTests")
   public void previewCellphoneTest() {
       xolaniWebAutomationAdvancePage.previewCellphone();
    }
    @Test(dependsOnMethods="previewCellphoneTest")
   public void selectCellphoneStorageTest() {
        xolaniWebAutomationAdvancePage.selectCellphoneStorage();
   }
    @Test(dependsOnMethods="selectCellphoneStorageTest")
    public void clickCellphoneColorDropdownTest() {
        xolaniWebAutomationAdvancePage.clickCellphoneColorDropdown();
  }
    @Test(dependsOnMethods="clickCellphoneColorDropdownTest")
    public void selectCellphoneColor() {
        xolaniWebAutomationAdvancePage.selectCellphoneColor();
    }

}