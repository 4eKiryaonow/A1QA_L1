package task3_1.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import task3_1.exception.IllegalBrowserNameException;
import task3_1.utils.JsonReader;

public class WebDriverFactory {

    public static WebDriver createDriver(final Browser browser) {

        WebDriver driver;

        switch (browser) {

            case CHROME:
                driver = createChromeDriver();
                break;

            case FIREFOX:
                driver = createFirefoxDriver();
                break;

            case EDGE:
                driver = createEdgeDriver();
                break;

            case OPERA:
                driver = createOperaDriver();
                break;

            default:
                throw new IllegalBrowserNameException();

        }

        return driver;

    }

    private static WebDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(getChromeOptions());

    }

    private static WebDriver createFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver(getFirefoxOptions());
    }

    private static WebDriver createEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver(getEdgeOptions());
    }

    private static WebDriver createOperaDriver() {
        WebDriverManager.operadriver().setup();
        return new OperaDriver(getOperaOptions());
    }

    private static ChromeOptions getChromeOptions() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments(JsonReader.getListFromJsonFile(JsonReader.PATH_TO_CONFIG, "options"));
        return options;

    }

    private static FirefoxOptions getFirefoxOptions() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments(JsonReader.getListFromJsonFile(JsonReader.PATH_TO_CONFIG, "options"));
        return options;
    }

    private static EdgeOptions getEdgeOptions() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments(JsonReader.getListFromJsonFile(JsonReader.PATH_TO_CONFIG, "options"));
        return options;
    }

    private static OperaOptions getOperaOptions() {
        OperaOptions options = new OperaOptions();
        options.addArguments(JsonReader.getListFromJsonFile(JsonReader.PATH_TO_CONFIG, "options"));
        return options;
    }
}
