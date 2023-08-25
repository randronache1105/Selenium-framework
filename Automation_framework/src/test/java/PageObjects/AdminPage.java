package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AdminPage {
    public WebDriver driver;

    public AdminPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
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
}
