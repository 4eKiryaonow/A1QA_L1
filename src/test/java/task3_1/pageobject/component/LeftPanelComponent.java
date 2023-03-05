package task3_1.pageobject.component;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Button;
import task3_1.element.Label;
import task3_1.pageobject.AlertsPageObject;
import task3_1.pageobject.FramesPageObject;
import task3_1.pageobject.NestedFramesPageObject;

public class LeftPanelComponent extends BaseForm {

    private static Label leftPanelLabel = new Label(
            By.cssSelector("div.left-pannel div.accordion"), "LeftPanel");
    private Button alertsFrameWindowsBtn = new Button(
            By.xpath("//*[contains(text(), 'Alerts, Frame & Windows')]//parent::div[@class='header-wrapper']"),
            "AlertsFrameWindowsBtn");
    private Button alertsBtn = new Button(
            By.xpath("//span[contains(text(), 'Alerts')]//parent::li"), "Alerts Button");
    private Button framesBtn = new Button(
            By.xpath("//span[contains(text(), 'Frames')]//parent::li"), "Frame Button");
    private Button nestedFramesBtn = new Button(
            By.xpath("//span[contains(text(), 'Nested Frames')]//parent::li"), "NestedFrames Button");
    private Button elementsBtn = new Button(
            By.xpath("//*[contains(text(), 'Elements')]//parent::div[@class='header-wrapper']"), "ElementsButton");
    private Button webTablesBtn = new Button(
            By.xpath("//span[contains(text(), 'Web Tables')]//parent::li"), "Web Tables Button");
    private Button browserWindowsBtn = new Button(
            By.xpath("//span[contains(text(), 'Browser Windows')]//parent::li"), "BrowserWindows Button");
    private Button linksBtn = new Button(
            By.xpath("//span[contains(text(), 'Links')]//parent::li"), "Links Button");

    public LeftPanelComponent() {
        super(leftPanelLabel, "LeftPanel");
    }

    public void clickAlertsBtn() {

        if (!alertsBtn.isElementDisplayed()) {
            alertsFrameWindowsBtn.clickElement();
        }
        alertsBtn.clickElement();
    }

    public void clickFramesBtn() {

        if (!framesBtn.isElementDisplayed()) {
            alertsFrameWindowsBtn.clickElement();
        }
        framesBtn.clickElement();

    }

    public void clickNestedFrames() {

        if (!nestedFramesBtn.isElementDisplayed()) {
            alertsFrameWindowsBtn.clickElement();
        }
        nestedFramesBtn.clickElement();

    }

    public void clickWebTables() {

        if (!webTablesBtn.isElementDisplayed()) {
            elementsBtn.clickElement();
        }
        webTablesBtn.clickElement();
    }

    public void clickWindowsBrowser() {

        if (!browserWindowsBtn.isElementDisplayed()) {
            alertsFrameWindowsBtn.clickElement();
        }
        browserWindowsBtn.clickElement();
    }

    public void clickLinks() {

        if (!linksBtn.isElementDisplayed()) {
            elementsBtn.clickElement();
        }
        linksBtn.clickElement();
    }


}
