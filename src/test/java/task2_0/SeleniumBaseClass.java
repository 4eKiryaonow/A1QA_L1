package task2_0;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import task2_0.webdriver.WebDriverProvider;

import java.time.Duration;

public abstract class SeleniumBaseClass {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected ChromeOptions options;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverProvider.getDriver();
        driver.navigate().to("https://store.steampowered.com/");


    }

    @AfterMethod
    public void tearDown() {
        WebDriverProvider.closeDriver();
    }
}
