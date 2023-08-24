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
import org.openqa.selenium.support.ui.Select;


import java.util.concurrent.TimeUnit;

public class LoginPageSteps {
    WebDriver driver = new ChromeDriver();
    @Given("I access {} page")
    public void LogIn(String url){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);
    }

    @When("I enter login credentials with {} and {}")
    public void EnterLoginCredentials(String username, String password) {
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

    @Then("I verify that the username is displayed in the navigation bar in the right corner of the application")
    public void UsernameInLoginPage() {
       WebElement name = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]"));
       Assert.assertTrue(name.isDisplayed());
       Assert.assertEquals(name.getText(),"Heet Nanda");
    }

    @And("I click the Leave link from the menu")
    public void ClickTheLeaveLinkFromTheMenu() {
        WebElement leave = driver.findElement(By.xpath("//a[@href=\"/web/index.php/leave/viewLeaveModule\"]"));
        leave.click();

    }

    @And("I select the Rejected status from the 'Show Leave with Status' section")
    public void SelectTheRejectedStatus() {
        driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"][1]")).click();
        WebElement choose = driver.findElement(By.xpath("//*[text()=\"Rejected\"]"));
        choose.click();

    }

    @Then("I check that the Rejected status is present as a selection by using XPath selector")
    public void CheckTheRejectedStatus() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement find = driver.findElement(By.xpath("//*[text()=\"Rejected \"]"));
        Assert.assertTrue(find.isDisplayed());
    }
}
