import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        ChromeDriver cd = new ChromeDriver();
        //open Elements.html on chrome
        cd.get("file:///Users/stalluri/github/wavefits/src/main/java/Elements.html");
        cd.manage().window().maximize();
        //button
        System.out.println(cd.findElement(By.xpath("//*[@id=\"btn\"]")).isEnabled());

        System.out.println(cd.findElement(By.xpath("//*[@id=\"btn\"]")).getText());

        System.out.println(cd.findElement(By.xpath("//*[@id=\"btn\"]")).getSize());

        Dimension dButton = cd.findElement(By.xpath("//*[@id=\"btn\"]")).getSize();
        System.out.println("Height: " + dButton.height);
        System.out.println("Width: " + dButton.width);

        System.out.println(cd.findElement(By.xpath("//*[@id=\"btn\"]")).getTagName());
        System.out.println(cd.findElement(By.xpath("//*[@id=\"btn\"]")).getAttribute("id"));

        //checkbox
        //click on the checkbox
        cd.findElement(By.xpath("/html/body/form[4]/input[1]")).click();
        System.out.println(cd.findElement(By.xpath("/html/body/form[4]/input[1]")).isEnabled());
        //check if the checkbox is selected
        System.out.println(cd.findElement(By.xpath("/html/body/form[4]/input[1]")).isSelected());

        //click on the checkbox again
        cd.findElement(By.xpath("/html/body/form[4]/input[1]")).click();
        //check if the checkbox is selected or not
        System.out.println(cd.findElement(By.xpath("/html/body/form[4]/input[1]")).isSelected());


        //dropdown list
        cd.findElement(By.name("dpdownsingle")).click();

        Select sDList = new Select(cd.findElement(By.name("dpdownsingle")));
        List<WebElement> optionList = sDList.getOptions();

        for(WebElement w: optionList){
            System.out.println("Options: " + w.getText());

        }

        sDList.selectByVisibleText("Audi");
        System.out.println("Is Multiple or not: " + sDList.isMultiple());

        Select multiSelect = new Select(cd.findElement(By.name("dpdwn")));
        System.out.println("Is Multiple select or not: " + multiSelect.isMultiple());

        multiSelect.selectByVisibleText("Opel");

        Thread.sleep(3000);

        multiSelect.selectByValue("volvo");

        Thread.sleep(2000);

        multiSelect.deselectAll();

        multiSelect.deselectByVisibleText("Opel");

        Thread.sleep(2000);

        multiSelect.selectByIndex(0);
        multiSelect.selectByIndex(3);
        Thread.sleep(2000);

        List<WebElement> selected = multiSelect.getAllSelectedOptions();

        for(WebElement w: selected){
            System.out.println("Option selected: " + w.getText());
        }

        System.out.println("First selected option" + multiSelect.getFirstSelectedOption().getText());
















    }
}
