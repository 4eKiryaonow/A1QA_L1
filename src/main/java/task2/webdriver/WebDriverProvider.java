package task2.webdriver;

import org.openqa.selenium.WebDriver;
import task2.utils.DataManager;

import java.util.Locale;
import java.util.Objects;

public final class WebDriverProvider {

    private static WebDriver driver;

    private WebDriverProvider() {
    }

    public static WebDriver getDriver() {

        if (Objects.isNull(driver)) {
            String browserName = DataManager.getBrowser();
            driver = WebDriverFactory.createDriver(Browser.valueOf(browserName.toUpperCase(Locale.ROOT)));

        }
        return driver;
    }

    public static void closeDriver() {

        driver.quit();
        driver = null;
    }


}
