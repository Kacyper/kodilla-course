package crudapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class CrudAppTestingApp {
    public static void main(String[] args) {
        WebDriver driver = new SafariDriver();
        driver.get("https://kacyper.github.io");

        WebElement searchField = driver.findElement(By.xpath("//html/body/main/section/form/fieldset/input"));
        searchField.sendKeys("New robotic task");

        WebElement textArea = driver.findElement(By.xpath("//html/body/main/section[1]/form/fieldset[2]/textarea"));
        textArea.sendKeys("The robotic content");
    }
}
