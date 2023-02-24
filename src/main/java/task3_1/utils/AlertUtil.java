package task3_1.utils;

public class AlertUtil {

    public static boolean alertIsPresent() {

        return ConditionalWait.alertIsPresent() != null;
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
