package task3_1.utils;

import org.openqa.selenium.By;
import task3_1.driver.WebDriverProvider;

public class FrameUtil {

    public static void switchToFrame(By locator) {

        WebDriverProvider
                .getDriver()
                .switchTo()
                .frame(WebDriverProvider.getDriver().findElement(locator));
    }

    public static void switchBackFromFrame(By locator) {

        WebDriverProvider
                .getDriver()
                .switchTo()
                .defaultContent();
    }
}
