package task2.webdriver;

import org.openqa.selenium.WebDriver;

import java.util.Locale;
import java.util.Objects;

public final class WebDriverProvider {

    private static WebDriver driver;

    private WebDriverProvider() {
    }

    public static WebDriver getDriver() {

        if (Objects.isNull(driver)) {
            //hardcode, move in json
            String browserName = "chrome";
            driver = WebDriverFactory.createDriver(Browser.valueOf(browserName.toUpperCase(Locale.ROOT)));

        }
        return driver;
    }

    public static void closeDriver() {

        driver.quit();
        driver = null;
    }


}
