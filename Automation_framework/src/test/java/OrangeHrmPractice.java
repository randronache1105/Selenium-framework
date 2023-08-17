import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class OrangeHrmPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title = driver.getTitle();

        String URL = driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String text = driver.findElement(By.cssSelector(".oxd-text.oxd-text--h5.orangehrm-login-title")).getText();

        System.out.println(title);
        System.out.println(URL);
        System.out.println(text);

        driver.close();
    }

}
