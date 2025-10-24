import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginLearningMaterials {

    WebDriver driver;
    String name;
    @BeforeClass
    public void launchBrowser() {
        driver = new ChromeDriver();
    }

    @Test
    public void startBrowser() throws InterruptedException {
        driver.get("https://ndosiautomation.co.za/");
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    public void verifyHomepageIsDisplayed() {
        driver.findElement(By.xpath("//*[@id=\"overview-hero\"]/h2")).isDisplayed();
    }

    @Test(priority = 2)
    public void clicklearningMaterial() {
        driver.findElement(By.id("nav-btn-practice")).click();
    }

    @Test(priority = 3)
    public void enterMail() {
        driver.findElement(By.id("login-email")).sendKeys("magendani01@gmail.com");
    }


    @Test(priority = 4)
    public void enterPassword() {
        driver.findElement(By.id("login-password")).sendKeys("LeLa@190301");
    }


    @Test(priority = 5)
    public void clickLoginButton() {
        driver.findElement(By.id("login-submit")).click();
    }

    @Test(priority = 6)
    public void verifyFormPageDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("practice-heading")).isDisplayed();
    }

    @Test(priority = 7)
    public void clickWebForm() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("tab-btn-password")).click();
    }

    @Test(priority = 8)
    public void enterUserName() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys("Xolani");
    }

    @Test(priority = 9)
    public void enterEmail() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("magendani01@gmail.com");
    }

    @Test(priority = 10)
    public void selectAge() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.id("age")).sendKeys("25");
    }

    @Test(priority = 11)
    public void selectGender() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.id("gender")).click();
        driver.findElement(By.xpath("//*[@id=\"gender\"]/option[2]")).click();
    }

    @Test(priority = 12)
        public void selectCountry() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.id("country")).click();
        driver.findElement(By.xpath("//*[@id=\"country\"]/option[4]")).click();
    }

    @Test(priority = 13)
    public void selectExperienceLevel() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.id("experience")).click();
        driver.findElement(By.xpath("//*[@id=\"experience\"]/option[2]")).click();
    }

    @Test(priority = 14)
    public void selectSkills() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"practice-form\"]/div[2]/div/label[2]")).click();
    }

    @Test(priority = 15)
    public void typeMessage() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.id("comments")).sendKeys("Xolani Madlala is conducting a Test Automation sequence ");
    }

    @Test(priority = 16)
    public void selectTerms() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"practice-form\"]/div[3]/label[2]")).click();
    }

    @Test(priority = 17)
    public void clickSubmitButton() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.id("submit-btn")).click();
    }
    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
