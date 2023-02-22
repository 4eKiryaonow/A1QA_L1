package task3_1.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import task3_1.driver.WebDriverProvider;
import task3_1.utils.JsonReader;

public class BaseTestClass {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverProvider.getDriver();
        driver.navigate().to(JsonReader.getStringFromJsonFile(JsonReader.PATH_TO_CONFIG, "url"));

    }

    @AfterMethod
    public void tearDown() {
        WebDriverProvider.closeDriver();
    }
}

