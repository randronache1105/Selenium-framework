import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitTest {
    private String baseUrl;
    WebDriver driver = new ChromeDriver();
    private WebElement element;

    @BeforeMethod
    public void setUp() throws Exception {
        baseUrl = "https://www.google.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void testUntitled() throws Exception {
        driver.get(baseUrl);
        WebElement find =  driver.findElement(By.xpath("//button/div[contains(text(), 'Accept all')]"));
        find.click();
        element = driver.findElement(By.id("APjFqb"));
        element.sendKeys("Selenium WebDriver Interview questions");
        element.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> list = driver.findElements(By.className("MjjYud"));
        System.out.println(list.size());

    }

    @AfterMethod
    public void tearDown() throws Exception {
        //driver.quit();
    }
}
