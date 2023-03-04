package task3_1.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import task3_1.base.BaseElement;
import task3_1.driver.WebDriverProvider;

import java.time.Duration;

public class ConditionalWait {

    private static Duration duration = Duration.ofSeconds(ConfigManager.getWaitDuration());

    public static void waitToBeClickable(By locator) {

        new WebDriverWait(WebDriverProvider.getDriver(), duration)
                .until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static Alert alertIsPresent() {

        return new WebDriverWait(WebDriverProvider.getDriver(), duration)
                .until(ExpectedConditions.alertIsPresent());

    }

    public static void waitElementDisappears(BaseElement element){
        new WebDriverWait(WebDriverProvider.getDriver(), duration)
                .until(ExpectedConditions.invisibilityOfElementLocated(element.getLocator()));
    }


}
