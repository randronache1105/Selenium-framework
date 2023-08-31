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

    @And("I click on the button with three dots which is located in the left corner for an employee record")
    public void ThreeDotsButton() {
        LeavePage leavePage = new LeavePage(driver);
        leavePage.ThreeDotsButton();
    }

    @And("I select to Add Comment from that list")
    public void SelectToAddComment() {
        LeavePage leavePage = new LeavePage(driver);
        leavePage.SelectToAddComment();
    }

    @And("I enter a comment in the Leave Request Comments section")
    public void EnterAComment() {
        LeavePage leavePage = new LeavePage(driver);
        leavePage.EnterAComment();
    }

    @And("I save the comment")
    public void SaveTheComment() {
        LeavePage leavePage = new LeavePage(driver);
        leavePage.SaveTheComment();
    }

    @Then("I should be able to see the confirmation message that the comment was added successfully")
    public void SeeCommentConfirmationMessage() {
        LeavePage leavePage = new LeavePage(driver);
        leavePage.SeeCommentConfirmationMessage();
    }

    @And("I select a specific period for which I want to see the records")
    public void SelectASpecificPeriod() {
        LeavePage leavePage = new LeavePage(driver);
        leavePage.SelectASpecificPeriod();
    }

    @And("I set Leave Type as US - Vacation")
    public void SetLeaveTypeAsUSVacation() {
        LeavePage leavePage = new LeavePage(driver);
        leavePage.SetLeaveTypeAsUSVacation();
    }

    @And("I press search button")
    public void PressSearchButton() {
        LeavePage leavePage = new LeavePage(driver);
        leavePage.PressSearchButton();
    }

    @Then("I should see all the records with all the data entered")
    public void SeeAllTheRecords() {
        LeavePage leavePage = new LeavePage(driver);
        leavePage.SeeAllTheRecords();
    }


    @And("I select a period from 2021-12-01 to 2023-12-31")
    public void SelectAPeriod() {
        LeavePage leavePage = new LeavePage(driver);
        leavePage.SelectAPeriod();
    }

    @And("I select Leave Type as CAN - Personal")
    public void SelectLeaveTypeAsCANPersonal() {
        LeavePage leavePage = new LeavePage(driver);
        leavePage.SelectLeaveTypeAsCANPersonal();
    }

    @And("I enter Anthony Nolan in the Employee Name field")
    public void EnterNameInTheEmployeeNameField() {
        LeavePage leavePage = new LeavePage(driver);
        leavePage.EnterNameInTheEmployeeNameField();
    }

    @And("I click on the Reset button")
    public void ClickOnTheResetButton() {
        LeavePage leavePage = new LeavePage(driver);
        leavePage.ClickOnTheResetButton();
    }

    @Then("I should see a pop-up message that says no records found")
    public void PopUpMessageThatSaysNoRecordsFound() {
        LeavePage leavePage = new LeavePage(driver);
        leavePage.PopUpMessageThatSaysNoRecordsFound();
    }

    @And("I select the Job Titles option from the Job menu dropdown")
    public void SelectTheJobTitlesOption() {
        AdminPage adminPage = new AdminPage(driver);
        adminPage.SelectTheJobTitlesOption();
    }

    @And("I click the Add button to add a new job")
    public void ClickTheAddButtonToAddANewJob() {
        AdminPage adminPage = new AdminPage(driver);
        adminPage.ClickTheAddButtonToAddANewJob();
    }

    @And("I add a name for the job in the Job Title field")
    public void AddANameForTheJob() {
        AdminPage adminPage = new AdminPage(driver);
        adminPage.AddANameForTheJob();
    }

    @And("I add a job description")
    public void AddAJobDescription() {
        AdminPage adminPage = new AdminPage(driver);
        adminPage.AddAJobDescription();
    }

    @And("I add a Job Specification file")
    public void AddAJobSpecificationFile() {
        AdminPage adminPage = new AdminPage(driver);
        adminPage.AddAJobSpecificationFile();
    }

    @And("I click the Save button to add the new job")
    public void ClickTheSaveButtonToAddTheNewJob() {
        AdminPage adminPage = new AdminPage(driver);
        adminPage.ClickTheSaveButtonToAddTheNewJob();
    }

    @And("I click on the My Info link on the menu which will redirect me to the PersonalDetails page")
    public void iClickOnTheMyInfoLink() {
        MyInfoPage myInfoPage = new MyInfoPage(driver);
        myInfoPage.iClickOnTheMyInfoLink();
    }

    @And("I click on the profile picture")
    public void iClickOnTheProfilePicture() {
        MyInfoPage myInfoPage = new MyInfoPage(driver);
        myInfoPage.iClickOnTheProfilePicture();
    }

    @And("I add a picture")
    public void AddAPicture() {
        MyInfoPage myInfoPage = new MyInfoPage(driver);
        myInfoPage.AddAPicture();
    }

    @And("I click the Save button")
    public void ClickTheSaveButton() {
        MyInfoPage myInfoPage = new MyInfoPage(driver);
        myInfoPage.ClickTheSaveButton();
    }

    @Then("I can see that my profile picture has been updated")
    public void MyProfilePictureHasBeenUpdated() {
        MyInfoPage myInfoPage = new MyInfoPage(driver);
        myInfoPage.MyProfilePictureHasBeenUpdated();
    }

    @And("I select the Contact Details link which will redirect me to the contactDetails page")
    public void SelectTheContactDetails() {
        ContactDetails contactDetails = new ContactDetails(driver);
        contactDetails.SelectTheContactDetails();
    }

    @And("I tick the checkbox to select one record saved in the Records Found section")
    public void TickTheCheckbox() {
        ContactDetails contactDetails = new ContactDetails(driver);
        contactDetails.TickTheCheckbox();
    }

    @And("I press the Delete button to delete that record")
    public void PressTheDeleteButton() {
        ContactDetails contactDetails = new ContactDetails(driver);
        contactDetails.PressTheDeleteButton();
    }

    @And("I press Yes to confirm this deletion")
    public void PressYesToConfirmThisDeletion() {
        ContactDetails contactDetails = new ContactDetails(driver);
        contactDetails.PressYesToConfirmThisDeletion();
    }

    @Then("I should receive a confirmation message that the record has been deleted successfully")
    public void RecordHasBeenDeletedSuccessfully() {
        ContactDetails contactDetails = new ContactDetails(driver);
        contactDetails.RecordHasBeenDeletedSuccessfully();
    }

    @And("I click on the Recruitment option from the menu")
    public void ClickOnTheRecruitmentOption() {
        VacanciesRecord vacanciesRecord = new VacanciesRecord(driver);
        vacanciesRecord.ClickOnTheRecruitmentOption();
    }

    @And("I click on the Vacancies option")
    public void ClickOnTheVacanciesOption() {
        VacanciesRecord vacanciesRecord = new VacanciesRecord(driver);
        vacanciesRecord.ClickOnTheVacanciesOption();
    }

    @And("I search for vacancies with job title as Account Assistant")
    public void SearchForVacanciesWithJobTitleAsAccountAssistant() {
        VacanciesRecord vacanciesRecord = new VacanciesRecord(driver);
        vacanciesRecord.SearchForVacanciesWithJobTitleAsAccountAssistant();
    }
}
