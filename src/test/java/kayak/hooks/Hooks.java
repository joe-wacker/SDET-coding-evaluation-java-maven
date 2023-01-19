package kayak.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import kayak.utils.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
    // Configure web driver for chrome
    @BeforeAll
    public static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    // Initialize the web driver
    @Before(value = "@SDET_Coding_Test")
    public static void setup() {
        Utils.setupDriver();
    }

    // Shut down the web driver
    @After(value = "@SDET_Coding_Test")
    public static void teardown() {
        Utils.teardownDriver();
    }
}
