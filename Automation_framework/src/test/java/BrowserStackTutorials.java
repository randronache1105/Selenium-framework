import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserStackTutorials {
    @Test
    public void testAssertFunctions() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.browserstack.com/");
//        String ActualTitle = driver.getTitle();
//        String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
//        Assert.assertEquals(ExpectedTitle, ActualTitle); // verify if the titles are equals
        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        assertTrue(verifyTitle);// pass the test if the titles are equals
    }
}
