package task3_1.pageobject;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Label;

public class FramesPageObject extends BaseForm {

    private static Label labelFrames = new Label(
            By.xpath("//div[@class='main-header'][contains(text(), 'Frames')]"),
            "labelFrames");


    public FramesPageObject() {
        super(labelFrames, "FramesPageObject");
    }
}
