import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class PopUpHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        ChromeDriver cd = new ChromeDriver();
        //open alert.html on chrome
        cd.get("file:///Users/stalluri/github/wavefits/src/main/java/popup.html");
        //get the window handle
        String parentWindowHandle = cd.getWindowHandle();
        //print the window handle
        System.out.println(parentWindowHandle);
        //click on the link with amazon.com
        cd.findElement(By.linkText("Visit amazon.com!")).click();
       // cd.findElement(By.xpath("/html/body/h1[1]/a")).click();
        Thread.sleep(3000);

        Set<String> wHandles = cd.getWindowHandles();

        System.out.println(wHandles.size());
        //title still shows the title of parent window
        System.out.println("Parent page Title: " + cd.getTitle());

        for(String s: wHandles){
            System.out.println(s);
            if(!s.equals(parentWindowHandle)){
                System.out.println("Child Window Hand: " + s);
                //switching to child window and now driver controls the child
                //window
                cd.switchTo().window(s);
                System.out.println("Child Window Title: " + cd.getTitle());
            }
        }
        cd.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("shoes");
        cd.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        Thread.sleep(3000);
        //switching to parent window
//        cd.switchTo().window(parentWindowHandle);
        //close the parent window
        cd.close();

        //cd.quit();








    }
}
