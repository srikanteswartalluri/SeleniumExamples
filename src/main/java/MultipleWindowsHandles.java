import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class MultipleWindowsHandles {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        ChromeDriver cd = new ChromeDriver();
        //open popup.html on chrome
        cd.get("file:///Users/stalluri/github/wavefits/src/main/java/popup.html");
        //get the window handle
        String parentWindowHandle = cd.getWindowHandle();
        //print the window handle
        System.out.println(parentWindowHandle);
        //click on the link with amazon.com
        //cd.findElement(By.linkText("Visit amazon.com!")).click();
        //1, 2, 3, 4
        List<WebElement> links = cd.findElements(By.xpath("//a"));
        for(WebElement h: links){
            h.click();
        }

//        for(int i=1;i<5;i++) {
//            cd.findElement(By.xpath("/html/body/h1[" + i +"]/a")).click();
//        }
//        Thread.sleep(3000);



    }
}
