package task3_1.test;

import org.testng.annotations.*;
import task3_1.driver.WebDriverProvider;
import task3_1.utils.BrowserUtil;
import task3_1.utils.ConfigManager;
import task3_1.utils.InfoLogger;

public class BaseTestClass {


    @BeforeMethod()
    public void setUp() {
        InfoLogger.info("setUp()");
        WebDriverProvider.getDriver();
        BrowserUtil.navigateToUrl(ConfigManager.getURL());

    }

    @AfterMethod
    public void tearDown() {
        InfoLogger.info("tearDown()");
        WebDriverProvider.closeDriver();
    }


}

