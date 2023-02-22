package task3_1.pageobject;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Label;

public class AlertsFrameWindowsPageObject extends BaseForm {

    private static Label AlertFrameWindowsLabel = new Label(
            By.xpath("//div[@class = 'main-header'][contains(text(), 'Alerts, Frame & Windows')]"),
            "AlertsFrameWindowsLabel");

    public AlertsFrameWindowsPageObject() {

        super(AlertFrameWindowsLabel, "AlertFrameWindowsPage");
    }
}
