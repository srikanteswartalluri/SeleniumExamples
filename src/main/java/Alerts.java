import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        ChromeDriver cd = new ChromeDriver();
        cd.get("file:///Users/stalluri/github/wavefits/src/main/java/alert.html");
       cd.findElement(By.xpath("/html/body/button")).click();
       String alertText = cd.switchTo().alert().getText();
        System.out.println("Alert text is:" + alertText);
        cd.switchTo().alert().accept();
        System.out.println(cd.findElement(By.xpath("//*[@id=\"demo\"]")).getText());

        cd.findElement(By.xpath("/html/body/button")).click();
        cd.switchTo().alert().dismiss();
        System.out.println(cd.findElement(By.xpath("//*[@id=\"demo\"]")).getText());
    }
}
