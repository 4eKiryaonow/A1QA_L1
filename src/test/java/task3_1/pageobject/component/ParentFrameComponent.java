package task3_1.pageobject.component;

import org.openqa.selenium.By;
import task3_1.base.BaseFrame;
import task3_1.element.Label;

public class ParentFrameComponent extends BaseFrame {

    private static By parentFrameLocator = By.id("frame1");
    private static Label parentFrameLabel = new Label(
            By.xpath("//body[contains(text(), 'Parent frame')]"), "parentFrameLabel");
    private ChildFrameComponent childFrameComponent;

    public ParentFrameComponent() {

        super(parentFrameLabel, parentFrameLocator, "ParentFrame");
        this.childFrameComponent = new ChildFrameComponent();
    }

    public ChildFrameComponent childFrame() {

        return this.childFrameComponent;
    }


}
