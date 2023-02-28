package task2_1.pageobject.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import task2_1.utils.BrowserUtils;
import task2_1.utils.JsonReader;

import java.time.Duration;

public abstract class AbstractBaseComponent {

    protected WebDriver driver;
    protected WebDriverWait wait;

    protected AbstractBaseComponent(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(BrowserUtils.getWaitDuration()));

    }
}