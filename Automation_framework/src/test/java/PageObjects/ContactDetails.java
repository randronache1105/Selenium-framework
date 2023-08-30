package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ContactDetails extends BasePage{
    public ContactDetails(WebDriver driver) {
        super(driver);
    }

    public void SelectTheContactDetails(){
        driver.findElement(By.xpath("//a[@href=\"/web/index.php/pim/contactDetails/empNumber/7\"]")).click();
    }

    public void TickTheCheckbox(){
        driver.findElement(By.xpath("//div[@class=\"oxd-table-cell oxd-padding-cell\"]/div/div/label/span/i[@class=\"oxd-icon bi-check oxd-checkbox-input-icon\"]")).click();
    }

    public void PressTheDeleteButton(){
        driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-trash\"]")).click();
    }

    public void PressYesToConfirmThisDeletion(){
        driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]")).click();
    }

    public void RecordHasBeenDeletedSuccessfully(){
       WebElement record = driver.findElement(By.xpath("//*[text()='Successfully Deleted']"));
        Assert.assertEquals(record.getText(), "Successfully Deleted");
    }
}
