import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

    public class DateTimePicker {

        @Test
        public void dateTimePicker(){
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://demo.guru99.com/test/");
            //Find the date time picker control

            WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));

            //Fill date as mm/dd/yyyy as 09/25/2013

            dateBox.sendKeys("25092013");

            //Press tab to shift focus to time field

            dateBox.sendKeys(Keys.TAB);

            //Fill time as 02:45 PM

            dateBox.sendKeys("0245PM");

        }

    }