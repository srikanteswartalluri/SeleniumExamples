import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class MultipleWindows {
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
        //cd.findElement(By.linkText("Visit amazon.com!")).click();
        //1, 2, 3, 4
//        List<WebElement> headers = cd.findElements(By.xpath("/html/body/h1"));
//        for(WebElement h: headers){
//            h.click();
//        }
        for(int i=1;i<5;i++) {
            cd.findElement(By.xpath("/html/body/h1[" + i +"]/a")).click();
        }
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
                String title = cd.getTitle();
                System.out.println("Child Window Title: " + title);
                //if condition : based on the title of the page do search operation
                Thread.sleep(3000);
                if(title.contains("Amazon")){
                    //search for amazon
                    cd.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("shoes");
                    cd.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
                }else if(title.contains("Google")){
                    cd.findElement(By.name("q")).sendKeys("shoes");
                    cd.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
                }else if(title.contains("Rediff")) {
                    cd.findElement(By.xpath("//*[@id=\"srchword\"]")).click();
                }


                }
                cd.close();
            }
        }
//        cd.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("shoes");
//        cd.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        //Thread.sleep(3000);
        //switching to parent window
//        cd.switchTo().window(parentWindowHandle);
        //close the parent window


        //cd.quit();
    }

