package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class XolaniInvoicePage {
    WebDriver driver;

    String parentWindow;
    @FindBy(id = "view-history-btn")
    WebElement viewInvoiceButton_id;

//    @FindBy(id = "clear-all-invoices-btn")
//    WebElement clearAllInvoiceButton_id;
//
//    @FindBy(id = "close-invoice-history-btn")
//    WebElement closeInvoicePage_id;

    @FindBy(xpath = "//button[starts-with(@id, 'view-invoice-')]")
    WebElement viewInvoiceHistoryButton_xpath;

    @FindBy(xpath = "//button[starts-with(@id, 'download-invoice-')]")
    WebElement saveAsPdfButton_xpath;


    public XolaniInvoicePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        parentWindow = driver.getWindowHandle();
    }

    public void clickViewInvoiceButton() throws InterruptedException {
        viewInvoiceButton_id.click();

    }

    public void switchBackToParent() {
        Set<String> handles = driver.getWindowHandles();

        for (String handle : handles) {
            if (!handle.equals(parentWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        driver.close(); // closes invoice tab
        driver.switchTo().window(parentWindow);
    }

    public void clickInvoiceHistoryButton() throws InterruptedException {
        viewInvoiceHistoryButton_xpath.click();
        Thread.sleep(2000);
        switchBackToParent();
    }

    public void clickSaveAsPdfButton() {
        saveAsPdfButton_xpath.click();
    }

//    public void clickClearAllInvoiceButton() {
//        clearAllInvoiceButton_id.click();
//    }
//
//    public void clickCloseInvoicePageIcon() {
//        closeInvoicePage_id.click();
//    }

}
