package task3_1.pageobject.component;

import org.openqa.selenium.By;
import task3_1.base.BaseFrame;
import task3_1.element.Label;

public class TopFrame extends BaseFrame {

    private static By topFrameLocator = By.id("frame1");
    private static Label topFrameLabel = new Label(By.id("sampleHeading"), "TopFrameLabel");

    public TopFrame() {

        super(topFrameLabel, topFrameLocator, "TopFrame");
    }

    public String getTopLabelText() {

        return topFrameLabel.getTextOfElement();
    }

}
