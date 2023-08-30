package PageObjects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

//    public WebDriver driver;
    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void EnterLoginCredentials(String username, String password) {
        WebElement name = driver.findElement(By.name("username"));
        name.sendKeys(username);
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys(password);
    }

    public void PressTheLoginButtonToLogIntoMyAccount() {
        WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        login.click();
    }
}
