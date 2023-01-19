package kayak.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KayakPage {
    WebDriver driver;

    public KayakPage(WebDriver driver) {
        this.driver = driver;
    }

    // -------------
    // Page Locators
    // -------------
    By exampleElement = By.id("thisIsAnExample");

    // ------------
    // Page Methods
    // ------------

    public void clickExample() {
        driver.findElement(exampleElement).click();
    }
}
