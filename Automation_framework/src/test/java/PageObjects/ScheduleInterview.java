package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScheduleInterview extends BasePage{
    public ScheduleInterview(WebDriver driver){
        super(driver);
    }

    public void ClickOnTheRecruitment(){
        driver.findElement(By.xpath("//a[@href=\"/web/index.php/recruitment/viewRecruitmentModule\"]")).click();
    }

    public void ClickOnTheViewIcon(){
        driver.findElement(By.xpath("(//div[text()=\"Shortlisted\"]/parent::div/following-sibling::div)[1]/div/button/i[@class=\"oxd-icon bi-eye-fill\"]")).click();
    }

    public void iClickTheScheduleInterviewButtonForThatCandidate(){
        driver.findElement(By.xpath("//*[text()=' Schedule Interview ']")).click();
    }

    public void iAddTheTitleOfTheInterview(){
        waitForElementVisible(By.xpath("//div[2]/div/div/div/div/input[@class=\"oxd-input oxd-input--active\"]"));
        WebElement title = driver.findElement(By.xpath("//div[2]/div/div/div/div/input"));
        title.click();
        title.sendKeys("Title");
    }

    public void iAddTwoInterviewersInTheInterviewerField(){
        WebElement inter = driver.findElement(By.xpath("//input[@include-employees=\"onlyCurrent\"]"));
        inter.click();
        inter.sendKeys("Anthony Nolan");
        driver.findElement(By.xpath("//*[text()='Anthony  Nolan']")).click();
    }

    public void iSelectADateAndHour(){
        driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-calendar oxd-date-input-icon\"]")).click();
        driver.findElement(By.xpath("//li[@class=\"oxd-calendar-selector-month\"]")).click();
        driver.findElement(By.xpath("//*[text() = 'May']")).click();
        driver.findElement(By.xpath("//li[@class=\"oxd-calendar-selector-year\"]/div/i[@class=\"oxd-icon bi-caret-down-fill oxd-icon-button__icon\"]")).click();
        driver.findElement(By.xpath("//*[text()='2023']")).click();
        driver.findElement(By.xpath("//div[@class=\"oxd-calendar-dates-grid\"]"));
        WebElement day = driver.findElement(By.xpath("//*[text()='13']"));
        day.click();
    }

    public void iPressTheSaveButtonToScheduleTheInterview(){
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
}
