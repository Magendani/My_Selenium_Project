package Testa;

import Pages.*;
import Utils.ReadFromFile;
import Utils.XolaniBrowserFactory;
import Utils.XolaniScreenShots;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class XolaniBase {
    XolaniBrowserFactory xolaniBrowserFactory = new XolaniBrowserFactory();

    final WebDriver driver = xolaniBrowserFactory.openBrowser("chrome", "https://ndosiautomation.co.za/");
    XolaniHomePage xolanihomePage = PageFactory.initElements(driver, XolaniHomePage.class);
    XolaniLogInPage xolaniLogInPage = PageFactory.initElements(driver, XolaniLogInPage.class);
    XolaniWebAutomationAdvancePage xolaniWebAutomationAdvancePage = PageFactory.initElements(driver, XolaniWebAutomationAdvancePage.class);
    XolaniLearningMaterialsPage xolaniLearningMaterialsPage= PageFactory.initElements(driver, XolaniLearningMaterialsPage.class );
    XolaniInvoicePage xolaniInvoicePage= PageFactory.initElements(driver, XolaniInvoicePage.class);
    XolaniScreenShots xolaniTakesScreenshots = new XolaniScreenShots();
    ReadFromFile readFromFile = new ReadFromFile();

}
