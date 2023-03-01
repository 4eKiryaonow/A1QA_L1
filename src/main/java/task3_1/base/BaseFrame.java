package task3_1.base;

import org.openqa.selenium.By;

public class BaseFrame extends BaseForm {

    private By frameLocator;

    public BaseFrame(BaseElement element, By frameLocator, String formName) {
        super(element, formName);
        this.frameLocator = frameLocator;
    }

}
