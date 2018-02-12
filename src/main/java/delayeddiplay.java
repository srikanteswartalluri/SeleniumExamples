import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class delayeddiplay {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        ChromeDriver cd = new ChromeDriver();
        //open Elements.html on chrome
        cd.get("file:///Users/stalluri/github/wavefits/src/main/java/DelayedDisplay.html");
        System.out.println(cd.findElement(By.xpath("//*[@id=\"mybutton\"]")).isDisplayed());
        Thread.sleep(3000);
        System.out.println(cd.findElement(By.xpath("//*[@id=\"mybutton\"]")).isDisplayed());
        System.out.println((cd.findElement(By.xpath("//*[@id=\"mybutton\"]")).getRect()));

        System.out.println("current URL: " + cd.getCurrentUrl());
        cd.navigate().to("http://www.google.com");
        Thread.sleep(2000);
        System.out.println("Nav To =current URL: " + cd.getCurrentUrl());
        cd.navigate().back();
        System.out.println("Back = current URL: " + cd.getCurrentUrl());
        Thread.sleep(2000);
        cd.navigate().forward();
        cd.findElement(By.name("q")).sendKeys("testing");
        cd.findElement(By.name("q")).submit();
        System.out.println("forward = current URL: " + cd.getCurrentUrl());
        Thread.sleep(2000);
        cd.navigate().refresh();
        System.out.println("refresh = current URL: " + cd.getCurrentUrl());

    }
}
