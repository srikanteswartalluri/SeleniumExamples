import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        ChromeDriver cd = new ChromeDriver();
        //open alert.html on chrome
        cd.get("file:///Users/stalluri/github/wavefits/src/main/java/Elements.html");
        //get the window handle
        String parentWindowHandle = cd.getWindowHandle();
        //print the window handle
        System.out.println(parentWindowHandle);
        System.out.println(cd.manage().window().getSize());
        Point p = cd.manage().window().getPosition();
        System.out.println("x: " + p.x + " y: " + p.y);
        cd.manage().window().maximize();
        p = cd.manage().window().getPosition();
        System.out.println("x: " + p.x + " y: " + p.y);
        System.out.println(cd.manage().window().getSize());
        Point setCoordinate = new Point(100, 100);
        cd.manage().window().setPosition(setCoordinate);
        Dimension newSize = new Dimension(50,50);
        cd.manage().window().setSize(newSize);
        //click on the link with amazon.com
        //cd.findElement(By.linkText("Visit amazon.com!")).click();
        //cd.quit();
        //cd.findElement(By.xpath("/html/body/form[2]/input[2]")).click();
        System.out.println("Is Displayed: " + cd.findElement(By.xpath("/html/body/form[2]/input[2]")).isDisplayed());
        System.out.println("Is Enabled: " + cd.findElement(By.xpath("/html/body/form[2]/input[2]")).isEnabled());
        System.out.println("Is Selected: " + cd.findElement(By.xpath("/html/body/form[2]/input[2]")).isSelected());

        System.out.println("button enabled " + cd.findElement(By.xpath("/html/body/button[1]")).isEnabled());
        System.out.println("button size " + cd.findElement(By.xpath("/html/body/button[1]")).getSize());
        //System.out.println("button rect " + cd.findElement(By.xpath("/html/body/button[1]")).getRect());
        System.out.println("button text " + cd.findElement(By.xpath("/html/body/button[1]")).getText());
        //System.out.println("button is selected " + cd.findElement(By.xpath("/html/body/button[1]")).isSelected());
        System.out.println("button tagname " + cd.findElement(By.xpath("/html/body/button[1]")).getTagName());
        System.out.println("button getattr " + cd.findElement(By.xpath("/html/body/button[1]")).getAttribute("id"));
    }
}
