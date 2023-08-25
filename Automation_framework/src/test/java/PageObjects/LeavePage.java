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
}
