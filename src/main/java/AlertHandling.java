import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        ChromeDriver cd = new ChromeDriver();
        //open alert.html on chrome
        cd.get("file:///Users/stalluri/github/wavefits/src/main/java/alert.html");
        //click on try it button
        cd.findElement(By.xpath("/html/body/button")).click();

        //print the text from alert box
        System.out.println( cd.switchTo().alert().getText());

        Thread.sleep(3000);
        //accept the alert
        cd.switchTo().alert().accept();
        //getting the text from the para

        System.out.println(cd.findElement(By.id("demo")).getText());



        //click on try it button
        cd.findElement(By.xpath("/html/body/button")).click();

        //dismiss the alert
        cd.switchTo().alert().dismiss();

        //getting the text from the para

        System.out.println(cd.findElement(By.id("demo")).getText());









    }
}
