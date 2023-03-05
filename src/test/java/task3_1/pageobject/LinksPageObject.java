package task3_1.pageobject;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Label;
import task3_1.pageobject.component.LeftPanelComponent;

public class LinksPageObject extends BaseForm {

    private static Label linksLabel = new Label(
            By.xpath("//div[@class='main-header'][contains(text(), 'Links')]"), "Links Label");
    private LeftPanelComponent leftPanel;


    public LinksPageObject() {
        super(linksLabel, "Links Page");

    }

}
