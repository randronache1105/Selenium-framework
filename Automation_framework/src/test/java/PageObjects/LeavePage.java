package PageObjects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LeavePage {
    public WebDriver driver;

    public LeavePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void SelectTheRejectedStatus() {
        driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"][1]")).click();
        WebElement choose = driver.findElement(By.xpath("//*[text()=\"Rejected\"]"));
        choose.click();
    }

    public void CheckTheRejectedStatus() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement find = driver.findElement(By.xpath("//*[text()=\"Rejected \"]"));
        Assert.assertTrue(find.isDisplayed());
    }

    public void VerifyNamePage(String header) {
        WebElement page = driver.findElement(By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]"));
        Assert.assertEquals(page.getText(), header);
    }

    public void ThreeDotsButton(){
        driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-three-dots-vertical\"][1]")).click();
    }

    public void SelectToAddComment(){
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[text()='Add Comment']")).click();
    }

    public void EnterAComment(){
        WebElement comment = driver.findElement(By.xpath("//textarea[@class=\"oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical\"]"));
        comment.click();
        comment.sendKeys("A comment");
    }

    public void SaveTheComment(){
        driver.findElement(By.xpath("//div[@data-v-cbb6349a]/button[@type=\"submit\"]")).click();
    }

    public void SeeCommentConfirmationMessage(){
        WebElement message = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text\"]"));
        Assert.assertEquals(message.getText(), "Successfully Saved");
    }
}
