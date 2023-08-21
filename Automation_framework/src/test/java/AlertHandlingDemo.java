import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandlingDemo {
    public static void main(String[] args) throws NoAlertPresentException,InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
        driver.findElement(By.id("alertexamples")).click();
        Alert alert = driver.switchTo().alert(); // switch to alert
        String alertMessage= driver.switchTo().alert().getText(); // capture alert message
        System.out.println(alertMessage); // Print Alert Message
        Thread.sleep(5000);

        alert.accept();
        driver.close();
    }
}