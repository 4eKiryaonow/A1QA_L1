package task3_1.pageobject;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Label;

public class WebTablePageObject extends BaseForm {

    private static Label webTableLabel = new Label(
            By.xpath("//div[@class = 'main-header'][contains(text(), 'Web Tables')]"), "WebTableLabel");

    public WebTablePageObject() {

        super(webTableLabel, "WebTablePage");
    }
}
