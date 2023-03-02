package task3_1.pageobject.component;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Button;
import task3_1.element.Label;
import task3_1.pageobject.AlertsPageObject;
import task3_1.pageobject.FramesPageObject;
import task3_1.pageobject.NestedFramesPageObject;

public class LeftPanelComponent extends BaseForm {

    private static Label LeftPanelLabel = new Label(
            By.cssSelector("div.left-pannel div.accordion"), "LeftPanel");
    private Button AlertsFrameWindowsBtn = new Button(
            By.xpath("//*[contains(text(), 'Alerts, Frame & Windows')]//parent::div[@class='header-wrapper']"),
            "AlertsFrameWindowsBtn");
    private Button AlertsBtn = new Button(
            By.xpath("//span[contains(text(), 'Alerts')]//parent::li"), "Alerts Button");
    private Button FramesBtn = new Button(
            By.xpath("//span[contains(text(), 'Frames')]//parent::li"), "Frame Button");
    private Button NestedFramesBtn = new Button(
            By.xpath("//span[contains(text(), 'Nested Frames')]//parent::li"), "NestedFrames Button");
    private Button ElementsBtn = new Button(
            By.xpath("//*[contains(text(), 'Elements')]//parent::div[@class='header-wrapper']"), "ElementsButton");
    private Button WebTablesBtn = new Button(
            By.xpath("//span[contains(text(), 'Web Tables')]//parent::li"), "Web Tables Button");

    public LeftPanelComponent() {
        super(LeftPanelLabel, "LeftPanel");
    }

    public void clickAlertsBtn() {

        if (!AlertsBtn.isElementDisplayed()) {
            AlertsFrameWindowsBtn.clickElement();
        }
        AlertsBtn.clickElement();
    }

    public void clickFramesBtn() {

        if (!FramesBtn.isElementDisplayed()) {
            AlertsFrameWindowsBtn.clickElement();
        }
        FramesBtn.clickElement();

    }

    public void clickNestedFrames() {

        if (!NestedFramesBtn.isElementDisplayed()) {
            AlertsFrameWindowsBtn.clickElement();
        }
        NestedFramesBtn.clickElement();

    }

    public void clickWebTables() {

        if (!WebTablesBtn.isElementDisplayed()) {
            ElementsBtn.clickElement();
        }
        WebTablesBtn.clickElement();
    }

}
