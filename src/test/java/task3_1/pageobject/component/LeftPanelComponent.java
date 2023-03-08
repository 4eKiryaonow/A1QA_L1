package task3_1.pageobject.component;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Button;
import task3_1.element.Label;

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
        alertsBtn.clickElement();
    }

    public void scrollAlertsBtn() {
        alertsBtn.scrollDownElement();
    }

    public void ScrollThenClickAlertsBtn() {
        scrollAlertsBtn();
        clickAlertsBtn();
    }

    public void clickFramesBtn() {
        framesBtn.clickElement();
    }

    public void scrollFramesBtn() {
        framesBtn.scrollDownElement();
    }

    public void scrollThenClickFramesBtn() {
        scrollFramesBtn();
        clickFramesBtn();
    }

    public void clickNestedFrames() {
        nestedFramesBtn.clickElement();
    }

    public void scrollNestedFrames() {
        nestedFramesBtn.scrollDownElement();
    }

    public void scrollThenClickNestedFramesBtn() {
        scrollNestedFrames();
        clickNestedFrames();
    }

    public void clickWebTables() {
        webTablesBtn.clickElement();
    }

    public void scrollWebTables() {
        webTablesBtn.scrollDownElement();
    }

    public void scrollThenClickWebTablesBtn() {
        scrollWebTables();
        clickWebTables();
    }

    public void clickWindowsBrowserBtn() {
        browserWindowsBtn.clickElement();
    }

    public void scrollWindowsBrowserBtn() {
        browserWindowsBtn.scrollDownElement();
    }

    public void scrollThenWindowsBrowserBtn() {
        scrollWindowsBrowserBtn();
        clickWindowsBrowserBtn();
    }

    public void clickLinksBtn() {
        linksBtn.clickElement();
    }

    public void scrollLinksBtn() {
        linksBtn.scrollDownElement();
    }

    public void scrollThenClickLinksBtn() {
        scrollLinksBtn();
        clickLinksBtn();
    }

    public void clickElementsBtn() {
        elementsBtn.clickElement();
    }

    public void scrollElementsBtn() {
        elementsBtn.scrollDownElement();
    }

    public void scrollThenClickElementsBtn() {
        scrollElementsBtn();
        clickElementsBtn();
    }
}
