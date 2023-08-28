package stepDefinitions;

import PageObjects.*;
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
        driver.manage().window().maximize();
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

    @And("I click the Admin link from the menu")
    public void ClickTheAdminLink() {
        ContactDetailsPage contactDetailsPage = new ContactDetailsPage(driver);
        contactDetailsPage.ClickTheAdminLink();
    }

    @And("I click on the Configuration dropdown menu button")
    public void ClickOnTheConfiguration() {
        AdminPage adminPage = new AdminPage(driver);
        adminPage.ClickOnTheConfiguration();
    }

    @And("I click on the Language Packages option")
    public void ClickOnTheLanguagePackages() {
        AdminPage adminPage = new AdminPage(driver);
        adminPage.ClickOnTheLanguagePackages();
    }

    @And("I click on the Translate button for Spanish - Español language package")
    public void ClickOnTheTranslate() {
        AdminPage adminPage = new AdminPage(driver);
        adminPage.ClickOnTheTranslate();
    }

    @Then("I should be redirected to the languageCustomization page")
    public void RedirectedToThePage() {
        AdminPage adminPage = new AdminPage(driver);
        adminPage.RedirectedToThePage();
    }

    @And("I click the Add button to add a new language to the packages")
    public void AddANewLanguage() {
        AddALanguage addALanguage = new AddALanguage(driver);
        addALanguage.AddANewLanguage();
    }

    @And("I select the language Colognian\\(Germany) from that list")
    public void SelectLanguage() {
        AddALanguage addALanguage = new AddALanguage(driver);
        addALanguage.SelectLanguage();
    }

    @And("I press the Save to add this new language to my packages")
    public void PressSave() {
        AddALanguage addALanguage = new AddALanguage(driver);
        addALanguage.PressSave();
    }

    @Then("I should be redirected to the Language Packages page")
    public void LanguagePackagesPage() {
        AddALanguage addALanguage = new AddALanguage(driver);
        addALanguage.LanguagePackagesPage();
    }

    @And("I select the Change Password option from drop-down user profile menu")
    public void SelectChangePasswordOption() {
        PasswordChange passwordChange = new PasswordChange(driver);
        passwordChange.SelectChangePasswordOption();
    }

    @And("I enter the current password in the Current Password field")
    public void EnterTheCurrentPassword() {
        PasswordChange passwordChange = new PasswordChange(driver);
        passwordChange.EnterTheCurrentPassword();
    }

    @And("I enter in the Password field a new password")
    public void EnterNewPassword() {
        PasswordChange passwordChange = new PasswordChange(driver);
        passwordChange.EnterNewPassword();
    }

    @Then("I verify {} page")
    public void VerifyNamePage(String header) {
        LeavePage leavePage = new LeavePage(driver);
        leavePage.VerifyNamePage(header);
    }

    @And("I confirm the new password")
    public void ConfirmTheNewPassword() {
        PasswordChange passwordChange = new PasswordChange(driver);
        passwordChange.ConfirmTheNewPassword();
    }

    @And("I press the Save button to update the password")
    public void PressSaveButton() {
        PasswordChange passwordChange = new PasswordChange(driver);
        passwordChange.PressSaveButton();
    }


    @Then("I should be able to see the confirmation message")
    public void ShowConfirmationMessage() {
        PasswordChange passwordChange = new PasswordChange(driver);
        passwordChange.ShowConfirmationMessage();
    }
}
