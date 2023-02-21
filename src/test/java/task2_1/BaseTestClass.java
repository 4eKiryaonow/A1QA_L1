package task2_1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import task2_1.utils.JsonReader;
import task2_1.webdriver.WebDriverProvider;

public abstract class BaseTestClass {

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
