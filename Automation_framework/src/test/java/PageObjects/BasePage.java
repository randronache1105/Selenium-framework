package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    protected WebElement waitForElementVisible(By element) {
        WebDriverWait wait = new WebDriverWait(this.getDriver(), 10L);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}
