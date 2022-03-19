package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new SafariDriver();
        driver.get("https://www.facebook.com/");

        WebElement cookies = driver.findElement(By.xpath("//div[contains(@class, \"_9xo5\")]/button[2]"));
        cookies.click();

        WebElement registrationForm = driver.findElement(By.xpath("//div[contains(@class, \"_6ltg\")]/a[1]"));
        registrationForm.click();


        Thread.sleep(2000);

        WebElement birthDay = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
        Select selectDay = new Select(birthDay);
        selectDay.selectByIndex(2);

        WebElement birthMonth = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
        Select selectMonth = new Select(birthMonth);
        selectMonth.selectByIndex(11);

        WebElement birthYear = driver.findElement(By.xpath("//select[@name=\"birthday_year\\\"]"));
        Select selectYear = new Select(birthYear);
        selectYear.selectByIndex(12);

    }
}