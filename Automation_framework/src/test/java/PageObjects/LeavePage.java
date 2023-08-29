package PageObjects;

import com.ibm.icu.impl.UResource;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    public void SelectASpecificPeriod(){
       WebElement start = driver.findElement(By.xpath("//div[1]/div/div/div/div/i[@class=\"oxd-icon bi-calendar oxd-date-input-icon\"]"));
       start.click();
       driver.findElement(By.xpath("//li[@class=\"oxd-calendar-selector-month\"]")).click();
       driver.findElement(By.xpath("//*[text() = 'May']")).click();
       driver.findElement(By.xpath("//li[@class=\"oxd-calendar-selector-year\"]/div/i[@class=\"oxd-icon bi-caret-down-fill oxd-icon-button__icon\"]")).click();
       driver.findElement(By.xpath("//*[text()='1997']")).click();
       driver.findElement(By.xpath("//div[@class=\"oxd-calendar-dates-grid\"]"));
       WebElement day = driver.findElement(By.xpath("//*[text()='13']"));
       day.click();

//        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", start);
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div/div/div/input[@class=\"oxd-input oxd-input--active\"]")));
//        element.click();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//
//        driver.findElement(By.xpath("//li[@class=\"--active oxd-calendar-selector-month\"]")).click();
//        driver.findElement(By.xpath("//*[text()='August']")).click();
//        driver.findElement(By.xpath("//div[@class=\"oxd-calendar-selector-year-selected\"]")).click();
//        driver.findElement(By.xpath("//*[text()='2022']")).click();
//        driver.findElement(By.xpath("//div[@class=\"oxd-calendar-dates-grid\"]"));
//        driver.findElement(By.xpath("//*[text()='10']")).click();

    }

    public void SetLeaveTypeAsUSVacation() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(150,0)", "");
        driver.findElement(By.xpath("//div[1]/div/div/div/div/div/div/div[text()='-- Select --']")).click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@role=\"option\"]/span[text()='US - Vacation']")).click();
    }

    public void PressSearchButton(){
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }

    public void SeeAllTheRecords(){
        WebElement norecords = driver.findElement(By.xpath("//*[@class=\"oxd-text oxd-text--span\"]"));
        Assert.assertNotEquals(norecords.getText(), "No Records Found");
    }
}
