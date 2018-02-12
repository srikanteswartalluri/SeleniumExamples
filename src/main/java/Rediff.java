import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        ChromeDriver cd = new ChromeDriver();

        cd.get("http://www.rediff.com/");
        System.out.println(cd.getTitle());

        cd.findElement(By.xpath("//*[@id=\"srchword\"]")).sendKeys("shoe");
        cd.findElement(By.xpath("//*[@id=\"queryTop\"]/input")).submit();

    }
}
