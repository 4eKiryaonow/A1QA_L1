package task3_1.base;

import org.openqa.selenium.By;
import task3_1.utils.FrameUtil;
import task3_1.utils.InfoLogger;

public abstract class BaseFrame {
    private By frameLocator;
    private BaseElement baseElement;
    private String formName;

    public BaseFrame(BaseElement element, By frameLocator, String formName) {
        this.baseElement = element;
        this.frameLocator = frameLocator;
        this.formName = formName;
    }

    public void switchToFrame() {
        InfoLogger.info(String.format("switchToFrame() for: %s",this.getFrameName()));
        FrameUtil.switchToFrame(frameLocator);
    }

    public void leaveFrame() {
        InfoLogger.info(String.format("leaveFrame() for: %s", this.getFrameName()));
        FrameUtil.switchBackFromFrame();
    }

    public String getFrameName() {
        return formName;
    }

}
