package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class EmployeeRecord extends BasePage{
    public EmployeeRecord(WebDriver driver){
        super(driver);
    }

    public void ClickOnTheMaintenanceOption(){
        driver.findElement(By.xpath("//a[@href=\"/web/index.php/maintenance/viewMaintenanceModule\"]")).click();
    }
    public void EnterMyPasswordToValidateMyAdministratorCredentials(){
        WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        password.click();
        password.sendKeys("admin123");
    }

    public void ClickTheConfirmButton(){
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }

    public void ClickOnTheAccessRecordsOption(){
        driver.findElement(By.xpath("//*[text()='Access Records']")).click();
    }

    public void EnterTheEmployeeNameField(){
        WebElement name = driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]"));
        name.click();
        name.sendKeys("Anthony Nolan");
        driver.findElement(By.xpath("//*[text()='Anthony  Nolan']")).click();
    }

    public void clickOnTheSearchButton(){
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }

    public void SeeThatTheEmployeeID(){
        WebElement ID = driver.findElement(By.xpath("//*[text()='Employee Id']"));
        Assert.assertEquals(ID.getText(),"Employee Id");
    }
}
