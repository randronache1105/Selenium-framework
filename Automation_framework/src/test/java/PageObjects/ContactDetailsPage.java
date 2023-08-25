package PageObjects;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ContactDetailsPage {

    public WebDriver driver;

    public ContactDetailsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void AccessContactDetails() {
        driver.findElement(By.xpath("//a[@href=\"/web/index.php/pim/contactDetails/empNumber/7\"]")).click();
    }

    public void UpdateTheStreetField() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement street = driver.findElement(By.xpath("//*[text()=\"Street 1\"]/parent::*/following-sibling::div/input"));
        street.clear();
        street.click();
        street.sendKeys("Alfond");
    }

    public void SelectCountry() {
        WebElement select = driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]"));
        select.click();
        WebElement country = driver.findElement(By.xpath("//*[text()=\"Algeria\"]"));
        country.click();
    }

    public void PressSaveButton(){
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }

    public void ConfirmationMessage(){
        WebElement message = driver.findElement(By.xpath("//div[@class=\"oxd-toast oxd-toast--success oxd-toast-container--toast\"]"));
        Assert.assertTrue(message.isDisplayed());
    }
}
