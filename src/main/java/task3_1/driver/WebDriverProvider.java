package task3_1.driver;

import org.openqa.selenium.WebDriver;
import task3_1.utils.ConfigManager;

import java.util.Locale;
import java.util.Objects;

public final class WebDriverProvider {

    private static WebDriver driver;

    private WebDriverProvider() {
    }

    public static WebDriver getDriver() {

        if (Objects.isNull(driver)) {
            String browserName = ConfigManager.getBrowser();
            driver = WebDriverFactory.createDriver(Browser.valueOf(browserName.toUpperCase(Locale.ROOT)));

        }
        return driver;
    }

    public static void closeDriver() {

        driver.quit();
        driver = null;
    }

}
