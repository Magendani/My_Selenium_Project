package Testa;

import Pages.*;
import Utils.XolaniBrowserFactory;
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


}
