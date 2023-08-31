package PageObjects;

import PageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddAnEmployee extends BasePage {
    public AddAnEmployee(WebDriver driver){
        super(driver);
    }

    public void ClickOnThePIMOption() {
        driver.findElement(By.xpath("//a[@href=\"/web/index.php/pim/viewPimModule\"]")).click();
    }

    public void ChooseTheAddEmployeeOption(){
        driver.findElement(By.xpath("//*[text()='Add Employee']")).click();
    }

    public void EnterTheEmployeeSFullName(){
       WebElement name = driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
       name.click();
       name.sendKeys("Alfi");
       WebElement second = driver.findElement(By.xpath("//input[@name=\"lastName\"]"));
       second.click();
       second.sendKeys("Second");
    }

    public void ClickTheCreateLoginDetailsButton(){
        driver.findElement(By.xpath("//span[@class=\"oxd-switch-input oxd-switch-input--active --label-right\"]")).click();
    }

    public void AddAUsernameAndPassword(){
        WebElement username= driver.findElement(By.xpath("//div[1]/div/div/div/input[@autocomplete=\"off\"]"));
        username.click();
        username.sendKeys("Matei");
        WebElement pass = driver.findElement(By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters user-password-cell\"]/div/div/input[@type=\"password\"]"));
        pass.click();
        pass.sendKeys("1234567aA");
        WebElement passconfirm = driver.findElement(By.xpath("//div[2]/div/div/input[@autocomplete=\"off\"]"));
        passconfirm.sendKeys("1234567aA");
    }
}
