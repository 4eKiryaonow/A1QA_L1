package task3_1.utils;

import org.openqa.selenium.By;
import task3_1.driver.WebDriverProvider;

public class FrameUtil {

    public static void switchToFrame(By locator) {
        InfoLogger.info(String.format("switchToFrame(\"%s\")", locator));
        WebDriverProvider
                .getDriver()
                .switchTo()
                .frame(WebDriverProvider.getDriver().findElement(locator));
    }

    public static void switchBackFromFrame() {
        InfoLogger.info("switchBackFromFrame()");
        WebDriverProvider
                .getDriver()
                .switchTo()
                .defaultContent();
    }
}
