package task3_1.pageobject;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Button;
import task3_1.element.Label;

public class MainPageObject extends BaseForm {

    private static Label homePageLabel = new Label(By.cssSelector(
            "div.home-banner img.banner-image"), "HomeBanner");
    private Button allertsFrameWindowsBtn = new Button(
            By.xpath("//div[@class = 'card-body']//*[contains(text(), 'Alerts, Frame & Windows')]"),
            "AllertsFrameWindowsButton");

    public MainPageObject() {

        super(homePageLabel, "MainPage");
    }




}
