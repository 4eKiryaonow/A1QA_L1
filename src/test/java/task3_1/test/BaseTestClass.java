package task3_1.test;

import org.testng.annotations.*;
import task3_1.driver.Browser;
import task3_1.driver.WebDriverProvider;
import task3_1.utils.BrowserUtil;
import task3_1.utils.ConfigManager;

public class BaseTestClass {


    @BeforeMethod()
    public void setUp() {
        WebDriverProvider.getDriver();
        BrowserUtil.navigateToUrl(ConfigManager.getURL());

    }

    @AfterMethod
    public void tearDown() {
        WebDriverProvider.closeDriver();
    }


}

