package task3_1.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import task3_1.driver.WebDriverProvider;
import task3_1.utils.ConfigManager;

public class BaseTestClass {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverProvider.getDriver();
        System.out.println("Step 1. Navigate to main page");
        driver.navigate().to(ConfigManager.getURL());

    }

    @AfterMethod
    public void tearDown() {
        WebDriverProvider.closeDriver();
    }
}

