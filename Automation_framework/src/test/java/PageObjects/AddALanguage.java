package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddALanguage extends BasePage {
    public AddALanguage(WebDriver driver){
        super(driver);
    }

    public void AddANewLanguage() {
        driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
        driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
    }

    public void SelectLanguage(){
        driver.findElement(By.xpath("//*[text()='Colognian (Germany)']")).click();
    }

    public void PressSave(){
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }

    public void LanguagePackagesPage(){
       WebElement page = driver.findElement(By.xpath("//*[text()='Language Packages'][1]"));
       Assert.assertEquals(page.getText(), "Language Packages");
    }
}
