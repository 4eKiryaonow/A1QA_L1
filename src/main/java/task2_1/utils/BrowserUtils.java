package task2_1.utils;

import task2_1.webdriver.WebDriverProvider;

import java.util.ArrayList;

public class BrowserUtils {

    public static String getUrl() {
        return JsonReader.getStringFromJsonFile(JsonReader.PATH_TO_CONFIG, "url");
    }
    public static String getCurrentTab() {

        return WebDriverProvider.getDriver().getWindowHandle();
    }
    public static void switchToNewTab() {

        ArrayList<String> newTab = new ArrayList<>(WebDriverProvider.getDriver().getWindowHandles());
        newTab.remove(getCurrentTab());
        WebDriverProvider.getDriver().switchTo().window(newTab.get(0));

    }




}
