package task2_1.webdriver;

import org.openqa.selenium.WebDriver;
import task2_1.utils.JsonReader;

import java.util.Locale;
import java.util.Objects;

public final class WebDriverProvider {

    private static WebDriver driver;

    private WebDriverProvider() {
    }

    public static WebDriver getDriver() {

        if (Objects.isNull(driver)) {
            String browserName = JsonReader.getStringFromJsonFile(JsonReader.PATH_TO_CONFIG,"browser");
            driver = WebDriverFactory.createDriver(Browser.valueOf(browserName.toUpperCase(Locale.ROOT)));

        }
        return driver;
    }

    public static void closeDriver() {

        driver.quit();
        driver = null;
    }
}
