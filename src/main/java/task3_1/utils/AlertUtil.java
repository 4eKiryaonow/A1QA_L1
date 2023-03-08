package task3_1.utils;

import org.openqa.selenium.support.ui.ExpectedConditions;
import task3_1.driver.WebDriverProvider;

public class AlertUtil {

    public static boolean alertIsPresent() {
        InfoLogger.info("alertIsPresent()");
        return ExpectedConditions.alertIsPresent().apply(WebDriverProvider.getDriver()) != null;
    }

    public static void acceptAlert() {
        InfoLogger.info("acceptAlert()");
        ConditionalWait.alertIsPresent().accept();
    }

    public static void dismissAlert() {
        InfoLogger.info("dismissAlert()");
        ConditionalWait.alertIsPresent().dismiss();
    }

    public static String getAlertText() {
        InfoLogger.info("getAlertText()");
        return ConditionalWait.alertIsPresent().getText();
    }

    public static void sendTextToAlert(String text) {
        InfoLogger.info(String.format("SendTextToAlert(\"%s\")", text));
        ConditionalWait.alertIsPresent().sendKeys(text);
    }
}
