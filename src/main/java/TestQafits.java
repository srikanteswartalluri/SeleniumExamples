import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestQafits {


    private WebDriver driver;

    @BeforeClass
    public  void setupClass(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setupTest(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(400, TimeUnit.SECONDS);
        driver.get("http://fits.qauber.com/#/page/login");
        WebElement userName = driver.findElement(By.name("account_email"));
        WebElement password = driver.findElement(By.name("account_password"));
        //Thread.sleep(2000);
        //WebDriverWait wait = new WebDriverWait(driver, 500);
       // wait.until(ExpectedConditions.elementToBeClickable(userName)).sendKeys("talluri.work@gmail.com");
        //wait.until(ExpectedConditions.elementToBeClickable(password));
//        userName.sendKeys("talluri.work@gmail.com");
        password.sendKeys("qauber");
        password.submit();
    }

    @AfterMethod
    public void teardown(){
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void test(){
        // Your test code here
        String reportHeader = driver.findElement(By.xpath("/html/body/div[2]/section/div/h3")).getText();
        Assert.assertTrue(reportHeader.contains("Reports"), "Text didn't match");
    }

}
