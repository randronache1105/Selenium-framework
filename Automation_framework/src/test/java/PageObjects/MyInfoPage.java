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
        WebElement file = driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-plus\"]"));
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
}