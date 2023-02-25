package task3_1.utils;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import task3_1.driver.WebDriverProvider;

public class AlertUtil {

    public static boolean alertIsPresent() {

        return ExpectedConditions.alertIsPresent().apply(WebDriverProvider.getDriver()) != null;
    }

    public static void acceptAlert() {

        ConditionalWait.alertIsPresent().accept();

    }

    public static void dismissAlert() {

        ConditionalWait.alertIsPresent().dismiss();
    }

    public static String getAlertText() {

        return ConditionalWait.alertIsPresent().getText();
    }

    public static void SendTextToAlert(String text) {

        ConditionalWait.alertIsPresent().sendKeys(text);
    }

}
