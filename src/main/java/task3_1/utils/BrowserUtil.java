package task3_1.utils;

import task3_1.driver.WebDriverProvider;

import java.util.ArrayList;

public class BrowserUtil {

    public static void navigateToUrl(String url) {
        InfoLogger.info(String.format("navigateToUrl(\"%s\")", url));
        WebDriverProvider.getDriver().navigate().to(url);
    }

    public static String getCurrentTab() {
        InfoLogger.info("getCurrentTab()");
        return WebDriverProvider.getDriver().getWindowHandle();
    }

    public static void switchToCertainTab(String tab) {
        InfoLogger.info(String.format("switchToCertainTab(\"%s\")", tab));
        WebDriverProvider.getDriver().switchTo().window(tab);
    }

    public static void switchToNewTab() {
        InfoLogger.info("switchToNewTab()");
        ArrayList<String> newTab = new ArrayList<>(WebDriverProvider.getDriver().getWindowHandles());
        newTab.remove(getCurrentTab());
        WebDriverProvider.getDriver().switchTo().window(newTab.get(0));
    }
    public static void closeCurrentTab() {
        InfoLogger.info("closeCurrentTab()");
        WebDriverProvider.getDriver().close();
    }
}
