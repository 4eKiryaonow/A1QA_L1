package task3_1.base;

import org.openqa.selenium.By;
import task3_1.utils.FrameUtil;

public abstract class BaseFrame extends BaseForm {

    private By frameLocator;

    public BaseFrame(BaseElement element, By frameLocator, String formName) {
        super(element, formName);
        this.frameLocator = frameLocator;
    }

    public void switchToFrame() {

        FrameUtil.switchToFrame(frameLocator);
    }

    public void leaveFrame() {

        FrameUtil.switchBackFromFrame();
    }

}
