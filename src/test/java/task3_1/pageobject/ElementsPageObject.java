package task3_1.pageobject;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Label;
import task3_1.pageobject.component.LeftPanelComponent;

public class ElementsPageObject extends BaseForm {

    private static Label elementsLabel = new Label(
            By.xpath("//div[@class = 'main-header'][contains(text(), 'Elements')]"), "ElementsLabel");
    private LeftPanelComponent leftPanel;

    public ElementsPageObject() {

        super(elementsLabel, "ElementsPage");
        this.leftPanel = new LeftPanelComponent();
    }

    public LeftPanelComponent LeftPanel() {

        return this.leftPanel;
    }
}
