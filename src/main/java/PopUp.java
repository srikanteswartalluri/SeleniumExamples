import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class PopUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        ChromeDriver cd = new ChromeDriver();
        cd.get("file:///Users/stalluri/github/wavefits/src/main/java/popup.html");
        String parentWindowHandle = cd.getWindowHandle();
        for(int i = 1; i<5;i++) {
            String xpath = "/html/body/h1["+ i + "]/a";
            cd.findElement(By.xpath(xpath)).click();
        }
        Thread.sleep(3000);
        Set<String> wHandles = cd.getWindowHandles();
        System.out.println(wHandles.size());
        for(String s: wHandles){
            System.out.println(s);
            if(!s.equals(parentWindowHandle)){
                cd.switchTo().window(s);
                System.out.println("Non Parent Window: " + cd.getTitle());
                Thread.sleep(3000);
            }

        }
        cd.switchTo().window(parentWindowHandle);
        System.out.println("Parent window: " + cd.getTitle());
        Thread.sleep(3000);
        cd.close();

        Thread.sleep(3000);
        cd.quit();
    }
}
