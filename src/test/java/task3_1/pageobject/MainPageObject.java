package task3_1.pageobject;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Button;
import task3_1.element.Label;

public class MainPageObject extends BaseForm {

    private static Label homePageLabel = new Label(By.cssSelector(
            "div.home-banner img.banner-image"), "HomeBanner");
    private Button allertsFrameWindowsBtn = new Button(
            By.xpath("//*[contains(text(), 'Alerts')]//parent::div"),
            "AllertsFrameWindowsButton");
    private Button elementsBtn = new Button(
            By.xpath("//*[contains(text(), 'Elements')]//parent::div"), "ElementsButton");

    public MainPageObject() {

        super(homePageLabel, "Main Page");
    }

    public void clickAlertsFrameWindowsBtn() {

        allertsFrameWindowsBtn.clickElement();
    }

    public void scrollAlertsFrameWindowsBtn() {

        allertsFrameWindowsBtn.scrollDownElement();
    }

    public void scrollThenClickAlertsFrameWindowsBtn() {
        scrollAlertsFrameWindowsBtn();
        clickAlertsFrameWindowsBtn();
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
