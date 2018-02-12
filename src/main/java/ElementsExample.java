import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ElementsExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        ChromeDriver cd = new ChromeDriver();
        cd.get("file:///Users/stalluri/github/wavefits/src/main/java/Elements.html");
        cd.findElement(By.name("dpdwn")).click();
        Select drpDown = new Select(cd.findElement(By.name("dpdwn")));
        System.out.println(drpDown.isMultiple());
        drpDown.deselectAll();

        drpDown.selectByVisibleText("Audi");
        Thread.sleep(2000);
        drpDown.selectByIndex(1);
        Thread.sleep(2000);
        drpDown.deselectByValue("audi");
        List<WebElement> dList = drpDown.getAllSelectedOptions();
        for(WebElement w: dList){
            System.out.println(w.getText());
        }


        System.out.println("Available options:");
        List<WebElement> aOptions = drpDown.getOptions();
        for(WebElement w: aOptions){
            System.out.println(w.getText());
        }

        System.out.println(cd.findElement(By.xpath("/html/body/form[4]/input[1]")).isSelected());
        Thread.sleep(3000);
        cd.findElement(By.xpath("/html/body/form[4]/input[1]")).click();


    }
}
