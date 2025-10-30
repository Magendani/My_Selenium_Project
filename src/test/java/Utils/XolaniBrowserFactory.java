package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class XolaniBrowserFactory {
    static WebDriver driver;

    public static WebDriver openBrowser(String browserChoice, String url) {
        if (browserChoice.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserChoice.equalsIgnoreCase("SAFARI   ")) {
            driver = new SafariDriver();
        } else if (browserChoice.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browserChoice.equalsIgnoreCase("internetexplorer")) {
            driver = new InternetExplorerDriver();
        } else {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

    public void test(){
        openBrowser(("chrome"), "https://ndosiautomation.co.za/");
    }
}