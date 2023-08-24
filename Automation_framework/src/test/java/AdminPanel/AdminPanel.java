package AdminPanel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AdminPanel {
    WebDriver driver = new ChromeDriver();
    @Given("Customer navigates to the website")
    public void navigateToWebsite() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }



    @And("clicks to Admin panel")
    public void clickAdminpanel(){
        WebElement Admin = driver.findElement(By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]"));
        Admin.click();
    }

    @Then("Customer can see details about other users")
    public void accessPage(){
        Assert.assertTrue(driver.findElement(By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]")).isDisplayed());

    }



}
