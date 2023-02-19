package task2_1.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import task2_1.webdriver.WebDriverProvider;

public class JavaScriptSupport {

    private static JavascriptExecutor jse;
    public static void pageScrollDown(WebElement element){
        jse = (JavascriptExecutor) WebDriverProvider.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
