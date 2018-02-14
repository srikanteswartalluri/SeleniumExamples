import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slider {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        ChromeDriver cd = new ChromeDriver();
        //open Elements.html on chrome
        cd.get("file:///Users/stalluri/github/wavefits/src/main/java/Slider.html");
        WebElement slider = cd.findElement(By.xpath("/html/body/div/input[1]"));

    }
}
