import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Reset_Password_AU {
    public static void main(String[] args) throws InterruptedException {
        String parenthandle;
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://fits.qauber.com/#/page/login");
        Thread.sleep(3000);
        parenthandle = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[@ui-sref='page.recover']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dsds12@mailinator.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        ((JavascriptExecutor)driver).executeScript("window.open();");
        ArrayList<String> tabs = new ArrayList <String>(driver.getWindowHandles());

        System.out.println(tabs.size());

        driver.switchTo().window(tabs.get(1));
        driver.get ("https://www.mailinator.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='inboxfield']")).sendKeys("dsds12");
        Thread.sleep(3000);
        //clicking on something
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//div[@class='all_message-min_text all_message-min_text-3']")).click();;
         Thread.sleep(5000);
         int size = driver.findElements(By.name("msg_body")).size();

         System.out.println(size);

         driver.switchTo().frame(1);
         driver.findElement(By.partialLinkText("http://fits.qauber.com/#/page/change-password")).click();
        Thread.sleep(3000);
        //driver.switchTo().window(tabs.get(0));
        System.out.println("after opening fits"  + tabs.size());

        System.out.println(driver.switchTo().window(tabs.get(0)).getTitle());
        driver.switchTo().window(tabs.get(0)).close();

        System.out.println(driver.switchTo().window(tabs.get(1)).getTitle());
        driver.switchTo().window(tabs.get(1)).close();
        tabs.clear();
        System.out.println("after closing fits "  + tabs.size());

        tabs.addAll(driver.getWindowHandles());
        System.out.println("after new  fetch "  + tabs.size());
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(4000);
        String str =driver.getWindowHandle();

        System.out.println(str);
        driver.findElement(By.xpath("//input[@id='id-password']")).sendKeys("464646");
        driver.findElement(By.xpath("//input[@name='password_confirm']")).sendKeys("464646");
//       Thread.sleep(3000);
//      //  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/form/div[2]/input")).sendKeys("242424");
//        driver.quit();
    }
}