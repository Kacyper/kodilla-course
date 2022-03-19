package ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class EBayTestingApp {
        public static void main(String[] args) {
            WebDriver driver = new SafariDriver();
            driver.get("https://www.ebay.com");

            WebElement searchField = driver.findElement(By.id("gh-ac"));
            searchField.sendKeys("laptop");
            searchField.submit();
        }
}

