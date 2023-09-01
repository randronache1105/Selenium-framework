package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class MyInfoPage extends BasePage {
    public MyInfoPage(WebDriver driver) {
        super(driver);
    }

    public void iClickOnTheMyInfoLink() {
        driver.findElement(By.xpath("//*[text()=\"My Info\"]")).click();
    }

    public void iClickOnTheProfilePicture() {
        driver.findElement(By.xpath("//img[@class=\"employee-image\"]")).click();
    }

    public void AddAPicture(){
        //waitForElementVisible(By.xpath("//div[@class=\"oxd-file-div oxd-file-div--active\"]"));
        WebElement file = driver.findElement(By.xpath("//input[@type=\"file\"]"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        file.sendKeys("/Users/randronache/Desktop/tree-736885_1280.jpg");
    }

    public void ClickTheSaveButton(){
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }

    public void MyProfilePictureHasBeenUpdated(){
        WebElement message = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text\"]"));
        Assert.assertEquals(message.getText(), "Successfully Saved");
    }

    public void iClickTheAddAttachmentsButton(){
        driver.findElement(By.xpath("//a[@href=\"/web/index.php/pim/contactDetails/empNumber/7\"]")).click();
        driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--text\"]")).click();
        WebElement file = driver.findElement(By.xpath("//input[@type=\"file\"]"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        file.sendKeys("/Users/randronache/Desktop/tree-736885_1280.jpg");
    }

    public void iAddACommentForThisDocumentUploaded(){
        WebElement comment = driver.findElement(By.xpath("//textarea[@class=\"oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical\"]"));
        comment.click();
        comment.sendKeys("Lorem ipsum");
    }

    public void iPressTheSaveButtonForThisAttachmentAdded(){
        driver.findElement(By.xpath("//div[@class=\"orangehrm-card-container\"]/form/div[@class=\"oxd-form-actions\"]/button[@type=\"submit\"]")).click();
    }
}