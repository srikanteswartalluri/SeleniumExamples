import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        ChromeDriver cd = new ChromeDriver();
        //open popup.html on chrome
        cd.get("file:///Users/stalluri/github/wavefits/src/main/java/popup.html");


        List<WebElement> wList = cd.findElements(By.xpath("//a"));

        for(WebElement w: wList){
            String txt = w.getText();
            System.out.println(w.getText());
            if(txt.contains("amazon")){
                w.click();
            }else if(txt.contains("google")){
                w.click();
            }

        }

        Thread.sleep(3000);

    }
}
