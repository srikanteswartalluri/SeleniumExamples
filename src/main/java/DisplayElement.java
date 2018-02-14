import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        ChromeDriver cd = new ChromeDriver();
        cd.get("file:///Users/stalluri/github/wavefits/src/main/java/DelayedDisplay.html");
        System.out.println(cd.findElement(By.id("mybutton")).isDisplayed());

        Thread.sleep(4000);
        System.out.println(cd.findElement(By.id("mybutton")).isDisplayed());
        cd.findElement(By.id("mybutton")).click();
    }
}
