package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginPageSteps {
    WebDriver driver = new ChromeDriver();
    @Given("I access {} page")
    public void LogIn(String url){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);
    }

    @When("I enter invalid login credentials with {} and {}")
    public void EnterInvalidLoginCredentials(String username, String password) {
        WebElement name = driver.findElement(By.name("username"));
        name.sendKeys(username);
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys(password);
    }

    @And("I press the Login button to log into my account")
    public void PressTheLoginButtonToLogIntoMyAccount() {
        WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        login.click();
    }

    @Then("I verify that an appropriate message is displayed for invalid credentials")
    public void VerifyThatAnAppropriateMessageIsDisplayedForInvalidCredentials() {
        WebElement error = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]"));
        //Assert.assertEquals(error.getText(), "Invalid credentials");
        Assert.assertTrue(error.isDisplayed());
    }

    @Then("I close the browser")
    public void CloseTheBrowser() {
        driver.quit();
    }
}
