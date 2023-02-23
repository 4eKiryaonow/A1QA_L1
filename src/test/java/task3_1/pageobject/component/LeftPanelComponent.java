package task3_1.pageobject.component;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Button;
import task3_1.element.Label;
import task3_1.pageobject.AlertsPageObject;
import task3_1.utils.ConditionalWait;

public class LeftPanelComponent extends BaseForm {

    private static Label LeftPanelLabel = new Label(
            By.cssSelector("div.left-pannel div.accordion"), "LeftPanel");
    private Button AlertsFrameWindowsBtn = new Button(
            By.xpath("//*[contains(text(), 'Alerts, Frame & Windows')]//parent::div[@class='header-wrapper']"),
            "AlertsFrameWindowsBtn");
    private Button AlertsBtn = new Button(By.xpath(
            "//span[contains(text(), 'Alerts')]//parent::li"),"AlertsButton");

    public LeftPanelComponent() {
        super(LeftPanelLabel, "LeftPanel");
    }

    public AlertsPageObject clickAlertsBtn() {

        if (!AlertsBtn.isElementDisplayed()) {
            AlertsFrameWindowsBtn.clickElement();
        }
        AlertsBtn.clickElement();

        return new AlertsPageObject();
    }

}
