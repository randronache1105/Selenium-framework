import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Driver {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch website
        driver.navigate().to("http://www.calculator.net/");

        //Maximize the browser
        driver.manage().window().maximize();

        // Click on Math Calculators
        driver.findElement(By.xpath("//span[@onclick = \"r(1)\"]")).click();

        // Click on Percent Calculators
        driver.findElement(By.xpath("//span[@onclick = \"r('*')\"]")).click();

        driver.findElement(By.xpath("//span[@onclick = \"r(3)\"]")).click();

        // Click Calculate Button
        driver.findElement(By.xpath("//span[@onclick = \"r('=')\"]")).click();


        // Get the Result Text based on its xpath
        String result =
                driver.findElement(By.id("sciOutPut")).getText();


        // Print a Log In message to the screen
        System.out.println(" The Result is " + result);

        //Close the Browser.
        driver.close();
    }
}