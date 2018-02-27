import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestLogin {
    private WebDriver driver;



    @BeforeMethod
    public void setUp()  {
        System.setProperty("webdriver.chrome.driver", "/Users/stalluri/Downloads/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }



    @DataProvider
    public Object[][] dprovider(){
        //test data
        Object[][] testData = { {"natasha@gmail.com", "password"},
                {"soni@gmail.com", "password"},
                {"roman@gmail.colm", "password"}
        };

        return testData;
    }

    @DataProvider
    public Object[] testData(){
        Object[] td = {"John", "Rob", "sherry"};
        return td;
    }

    @DataProvider
    public Object[][] excelData(){
        Object[][] testData = getExcelData("/Users/stalluri/Downloads/testExcel.xls","Sheet1");
        return testData;
    }

    public String[][] getExcelData(String fileName, String sheetName) {
        String[][] arrayExcelData = null;
        try {
            FileInputStream fs = new FileInputStream(fileName);
            Workbook wb = Workbook.getWorkbook(fs);
            Sheet sh = wb.getSheet(sheetName);

            int totalNoOfCols = sh.getColumns();
            int totalNoOfRows = sh.getRows();

            arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];

            for (int i= 1 ; i < totalNoOfRows; i++) {

                for (int j=0; j < totalNoOfCols; j++) {
                    arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        return arrayExcelData;
    }

    @Test(dataProvider = "excelData")
    public void testExcel(String user, String pass){
        System.out.println("User: " + user + " Pass: " + pass);
    }




    @Test(dataProvider = "testData")
    public void testOne(String s){
        System.out.println("name: " + s);
    }



    @Test(dataProvider = "dprovider" )
    public void testDummy(String userName, String password){
        System.out.println("username: " + userName);
        System.out.println("password: " + password );

    }


    @Test
    public void testLoginValidation() throws Exception {
        driver.get("http://fits.qauber.com/#/page/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
        WebElement userName = driver.findElement(By.name("account_email"));


        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(
                ExpectedConditions.elementToBeClickable(userName)
        );
        WebElement password = driver.findElement(By.name("account_password"));
        userName.sendKeys("talluri.work@gmail.com");
        password.sendKeys("qauber");
        password.submit();
//Click on number 2 button.
        driver.findElement(By
                .xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.Button[5]"))
                .click();

        // Click on + button.
        driver.findElement(By
                .xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.view.View[2]/android.widget.Button[5]"))
                .click();

        // Click on number 5 button.
        driver.findElement(By
                .xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.Button[2]"))
                .click();

        // Click on = button.
        driver.findElement(By
                .xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.Button[12]"))
                .click();

        // Get result from result text box.
        String result = driver
                .findElement(By
                        .xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText[1]"))
                .getText();
        System.out.println("Number sum result is : " + result);
        Assert.assertTrue(loginPageText.contains("Reports"), "Login home page text didn't match");

    }
}
