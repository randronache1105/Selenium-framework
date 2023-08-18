import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static javax.swing.text.html.CSS.getAttribute;

public class OrangeHrmPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title = driver.getTitle();

        String URL = driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String text = driver.findElement(By.cssSelector(".oxd-text.oxd-text--h5.orangehrm-login-title")).getText();

        String attribute = driver.findElement(By.xpath("//form[@class = \"oxd-form\"]")).getAttribute("method");

        Boolean textBox = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p\"][2]")).isEnabled();

        System.out.println(title);// show title of the page
        System.out.println(URL);//show url
        System.out.println(text);//show the text ina web page for button login
        System.out.println(attribute);//take the attribute from value class
        System.out.println(textBox);//return true or false if the element exists

        driver.close();
    }

}
