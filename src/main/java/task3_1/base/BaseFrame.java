package task3_1.base;

import org.openqa.selenium.By;
import task3_1.utils.FrameUtil;
import task3_1.utils.InfoLogger;

public abstract class BaseFrame extends BaseForm {

    private By frameLocator;

    public BaseFrame(BaseElement element, By frameLocator, String formName) {
        super(element, formName);
        this.frameLocator = frameLocator;
    }

    public void switchToFrame() {
        InfoLogger.info(String.format("switchToFrame() for: %s",this.getFormName()));
        FrameUtil.switchToFrame(frameLocator);
    }

    public void leaveFrame() {
        InfoLogger.info(String.format("leaveFrame() for: %s", this.getFormName()));
        FrameUtil.switchBackFromFrame();
    }

}
