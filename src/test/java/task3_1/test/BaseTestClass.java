package task3_1.test;

import org.testng.annotations.*;
import task3_1.driver.WebDriverProvider;
import task3_1.utils.ConfigManager;

public class BaseTestClass {


    @BeforeMethod()
    public void setUp() {
        WebDriverProvider.getDriver();
        System.out.println("Step 1. Navigate to main page");
        WebDriverProvider.getDriver().navigate().to(ConfigManager.getURL());

    }

    @AfterMethod
    public void tearDown() {
        WebDriverProvider.closeDriver();
    }


}

