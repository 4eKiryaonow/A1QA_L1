package task3_1.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import task3_1.driver.WebDriverProvider;

public class JsUtil {

    public static void pageScrollDown(By locator) {
        InfoLogger.info(String.format("pageScrollDown(\"%s\")", locator));
        WebElement element = WebDriverProvider.getDriver().findElement(locator);
        ((JavascriptExecutor) WebDriverProvider.getDriver()).executeScript(
                "arguments[0].scrollIntoView(true);", element);
    }
}