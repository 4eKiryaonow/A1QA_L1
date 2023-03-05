package task3_1.pageobject;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Button;
import task3_1.element.Label;

public class BrowserWindowsPageObject extends BaseForm {

    private static Label labelBrowserWindows = new Label(
            By.xpath("//div[@class = 'main-header'][contains(text(), 'Browser Windows')]"),
            "BrowserWindows Label");
    private Button newTabBtn = new Button(By.id("tabButton"), "NewTab Button");

    public BrowserWindowsPageObject() {
        super(labelBrowserWindows, "BrowserWindowsPage");
    }

    public void clickTabBtn() {

        newTabBtn.clickElement();
    }
}
