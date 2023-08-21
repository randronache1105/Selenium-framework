import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Tables {

    //Test to handle dynamic web table using Selenium WebDriver

    WebDriver driver = new ChromeDriver();

        @Test
        public void tripDetails() throws InterruptedException, AWTException
        {
//Modify Wait time as per the Network Ability in the Thread Sleep method

            driver.get("https://chercher.tech/practice/table");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Thread.sleep(5000);

//Finding number of Rows

            List<WebElement> rowsNumber = driver.findElements(By.xpath("//table[@id=\"webtable\"]/tbody/tr"));
            int rowCount = rowsNumber.size();
            System.out.println("No of rows in this table : " + rowCount);

//Finding number of Columns

            List<WebElement> columnsNumber = driver.findElements(By.xpath("//table[@id=\"webtable\"]/tbody/tr/th"));
            int columnCount = columnsNumber.size();
            System.out.println("No of columns in this table : " + columnCount);

//Finding cell value at 4th row and 3rd column

            WebElement cellAddress = driver.findElement(By.xpath("//table[@id=\"webtable\"]/tbody/tr[2]/td[1]"));
            String value = cellAddress.getText();
            System.out.println("The Cell Value is : " +value);

            driver.quit();
        }

    }

