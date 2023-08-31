package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VacanciesRecord extends BasePage{
    public VacanciesRecord(WebDriver driver){
        super(driver);
    }

    public void ClickOnTheRecruitmentOption() {
        driver.findElement(By.xpath("//a[@href=\"/web/index.php/recruitment/viewRecruitmentModule\"]")).click();
    }

    public void ClickOnTheVacanciesOption(){
        driver.findElement(By.xpath("//*[text()='Vacancies']")).click();
    }

    public void SearchForVacanciesWithJobTitleAsAccountAssistant() {
        driver.findElement(By.xpath("//div[1]/div/div/div/div/div/i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
        driver.findElement(By.xpath("//span[text()='Account Assist']")).click();
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
}
