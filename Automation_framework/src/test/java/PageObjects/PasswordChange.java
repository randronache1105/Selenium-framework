package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PasswordChange extends BasePage{
    public PasswordChange(WebDriver driver){
        super(driver);
    }

    public void SelectChangePasswordOption(){
        driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"/web/index.php/pim/updatePassword\"]")).click();
    }

    public void EnterTheCurrentPassword(){
      WebElement pass =  driver.findElement(By.xpath("//div[@class=\"oxd-form-row\"]/div/div/div/div/input[@type=\"password\"]"));
      pass.click();
      pass.sendKeys("admin123");
    }

    public void EnterNewPassword() {
        WebElement password =  driver.findElement(By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters user-password-cell\"]/div/div/input[@autocomplete=\"off\"]"));
        password.click();
        password.sendKeys("admin1234");
    }

    public void ConfirmTheNewPassword(){
        WebElement confirmPassword = driver.findElement(By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"]/div/div/input[@autocomplete=\"off\"]"));
        confirmPassword.click();
        confirmPassword.sendKeys("admin1234");
    }

    public void PressSaveButton(){
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }

    public void ShowConfirmationMessage(){
        WebElement message = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text\"]"));
        Assert.assertEquals(message.getText(), "Successfully Saved");
    }
}
