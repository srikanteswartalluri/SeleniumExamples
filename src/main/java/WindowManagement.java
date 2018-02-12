import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowManagement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        ChromeDriver cd = new ChromeDriver();
        cd.get("file:///Users/stalluri/github/wavefits/src/main/java/popup.html");
        //maximize window
        cd.manage().window().maximize();
        //get the size of the current window
        System.out.println(cd.manage().window().getSize());
        Thread.sleep(3000);
        Dimension d = new Dimension(500, 600);
        //set the size of the current window
        //cd.manage().window().setSize(d);

        //get the location of your window
        System.out.println(cd.manage().window().getPosition());

        //set the position of the window
        Point position = new Point(100, 100);
        cd.manage().window().setPosition(position);


    }
}
