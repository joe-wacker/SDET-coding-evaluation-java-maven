package kayak.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Utils {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setupDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
    }

    public static void teardownDriver() {
        driver.quit();
    }
}
