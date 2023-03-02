package task3_1.pageobject;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Label;
import task3_1.pageobject.component.LeftPanelComponent;

public class NestedFramesPageObject extends BaseForm {

    private static Label labelNestedFrames = new Label(
            By.xpath("//div[@class='main-header'][contains(text(), 'Nested Frames')]"),
            "NestedFramesLabel");
    private LeftPanelComponent leftPanel;

    public NestedFramesPageObject() {

        super(labelNestedFrames, "NestedFramesPageObject");
        this.leftPanel = new LeftPanelComponent();
    }

    public LeftPanelComponent leftPanel() {

        return this.leftPanel;

    }
}
