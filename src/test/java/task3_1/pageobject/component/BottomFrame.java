package task3_1.pageobject.component;

import org.openqa.selenium.By;
import task3_1.base.BaseFrame;
import task3_1.element.Label;

public class BottomFrame extends BaseFrame {

    private static By bottomFrameLocator = By.id("frame2");
    private static Label bottomFrameLabel = new Label(By.id("sampleHeading"), "BottomFrameLabel");

    public BottomFrame() {

        super(bottomFrameLabel, bottomFrameLocator, "BottomFrame");
    }

    public String getBottomFrameText() {

        return bottomFrameLabel.getTextOfElement();
    }
}
