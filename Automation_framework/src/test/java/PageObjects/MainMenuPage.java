package PageObjects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MainMenuPage extends BasePage{

    public MainMenuPage(WebDriver driver){
        super(driver);
    }

    public void UsernameInLoginPage() {
        WebElement name = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]"));
        Assert.assertTrue(name.isDisplayed());
        Assert.assertEquals(name.getText(),"Heet Nanda");
    }

    public void ClickTheLeaveLinkFromTheMenu() {
        WebElement leave = driver.findElement(By.xpath("//a[@href=\"/web/index.php/leave/viewLeaveModule\"]"));
        leave.click();

    }

    public void AccessInfoOption() {
        driver.findElement(By.xpath("//*[text()=\"My Info\"]")).click();
    }
}
