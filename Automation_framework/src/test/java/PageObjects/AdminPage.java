package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AdminPage extends BasePage {

    public AdminPage(WebDriver driver){
       super(driver);
    }

    public void ClickOnTheConfiguration(){
        driver.findElement(By.xpath("//*[text()=\"Configuration \"]")).click();
    }

    public void ClickOnTheLanguagePackages(){
        driver.findElement(By.xpath("//*[text()=\"Language Packages\"]")).click();
    }

    public void ClickOnTheTranslate(){
        driver.findElement(By.xpath("//*[text()=\"Spanish - Español\"]")).click();
        driver.findElement(By.xpath("//div[text()=\"Spanish - Español\"]/parent::*/parent::*/div[2]/div/button[1]")).click();
    }

    public void RedirectedToThePage(){
       WebElement text =  driver.findElement(By.xpath("//*[text()=\"Translate Language Package\"]"));
        Assert.assertEquals(text.getText(), "Translate Language Package");
    }

    public void SelectTheJobTitlesOption(){
        driver.findElement(By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]")).click();
    }

    public void ClickTheAddButtonToAddANewJob(){
        driver.findElement(By.xpath("//*[text()='Job ']")).click();
        driver.findElement(By.xpath("//*[text()='Job Titles']")).click();
        driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
    }

    public void AddANameForTheJob() {
        WebElement title = driver.findElement(By.xpath("//div[@class=\"oxd-form-row\"]/div/div/input[@class=\"oxd-input oxd-input--active\"]"));
        title.click();
        title.sendKeys("Constructor");
    }

    public void AddAJobDescription(){
        WebElement description = driver.findElement(By.xpath("//textarea[@placeholder=\"Type description here\"]"));
        description.click();
        description.sendKeys("Lorem ipsum");
    }

    public void AddAJobSpecificationFile() {
        waitForElementVisible(By.xpath("//div[@class=\"oxd-file-input-div\"]"));
        WebElement file = driver.findElement(By.xpath("//input[@type=\"file\"]"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        file.sendKeys("/Users/randronache/Desktop/tree-736885_1280.jpg");
    }

    public void ClickTheSaveButtonToAddTheNewJob() {
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
}
