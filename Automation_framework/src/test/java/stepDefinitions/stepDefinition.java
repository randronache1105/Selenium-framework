package stepDefinitions;

import PageObjects.ContactDetailsPage;
import PageObjects.LeavePage;
import PageObjects.LoginPage;
import PageObjects.MainMenuPage;
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

public class stepDefinition {
    WebDriver driver = new ChromeDriver();

    @Given("I access {} page")
    public void LogIn(String url){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);
    }

    @When("I enter login credentials with {} and {}")
    public void EnterLoginCredentials(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.EnterLoginCredentials(username,password);
    }

    @And("I press the Login button to log into my account")
    public void PressTheLoginButtonToLogIntoMyAccount() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.PressTheLoginButtonToLogIntoMyAccount();
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
    @And("I click on the Contact Details link which will redirect me to the contactDetails page")
    public void AccessContactDetails() {
        ContactDetailsPage contactDetailsPage = new ContactDetailsPage(driver);
        contactDetailsPage.AccessContactDetails();
    }

    @And("I update the Street 1 field from contact details")
    public void UpdateTheStreetField() {
        ContactDetailsPage contactDetailsPage = new ContactDetailsPage(driver);
        contactDetailsPage.UpdateTheStreetField();
    }
    @Then("I verify that the username is displayed in the navigation bar in the right corner of the application")
    public void UsernameInLoginPage() {
        MainMenuPage mainMenuPage = new MainMenuPage(driver);
        mainMenuPage.UsernameInLoginPage();
    }

    @And("I click the Leave link from the menu")
    public void ClickTheLeaveLinkFromTheMenu() {
        MainMenuPage mainMenuPage = new MainMenuPage(driver);
        mainMenuPage.ClickTheLeaveLinkFromTheMenu();
    }

    @And("I click the My Info option from the menu")
    public void AccessInfoOption() {
        MainMenuPage mainMenuPage = new MainMenuPage(driver);
        mainMenuPage.AccessInfoOption();    }

    @And("I select the Rejected status from the 'Show Leave with Status' section")
    public void SelectTheRejectedStatus() {
        LeavePage leavePage = new LeavePage(driver);
        leavePage.SelectTheRejectedStatus();
    }

    @Then("I check that the Rejected status is present as a selection by using XPath selector")
    public void CheckTheRejectedStatus() {
        LeavePage leavePage = new LeavePage(driver);
        leavePage.CheckTheRejectedStatus();
    }

    @And("I select Algeria as country")
    public void SelectCountry() {
        ContactDetailsPage contactDetailsPage = new ContactDetailsPage(driver);
        contactDetailsPage.SelectCountry();
    }

    @And("I press the Save button")
    public void PressTheSaveButton() {
        ContactDetailsPage contactDetailsPage = new ContactDetailsPage(driver);
        contactDetailsPage.PressSaveButton();
    }

    @Then("I should see the successfully updated confirmation message")
    public void ConfirmationMessage() {
        ContactDetailsPage contactDetailsPage = new ContactDetailsPage(driver);
        contactDetailsPage.ConfirmationMessage();
    }
}