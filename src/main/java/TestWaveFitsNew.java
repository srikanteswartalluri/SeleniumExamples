import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestWaveFitsNew {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        ChromeDriver cd = new ChromeDriver();
        cd.get("http://fits.qauber.com/#/page/login");
        Thread.sleep(3000);
        cd.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        WebElement email = cd.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]"));

        email.sendKeys("talluri.work@gmail.com");
        WebElement password = cd.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]"));

        password.sendKeys("SiriEdu123");

        WebElement login = cd.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/form/button"));

       login.click();

    }



}
