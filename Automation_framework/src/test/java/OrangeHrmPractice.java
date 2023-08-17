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
        String title = driver.getTitle();// show title of the page

        String URL = driver.getCurrentUrl();//show url
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String text = driver.findElement(By.cssSelector(".oxd-text.oxd-text--h5.orangehrm-login-title")).getText();//show the text ina web page for button login

        String attribute = driver.findElement(By.xpath("//p[@class = \"oxd-text oxd-text--p\"][2]")).getAttribute("class");

        System.out.println(title);
        System.out.println(URL);
        System.out.println(text);
        System.out.println(attribute);

        driver.close();
    }

}
