package task3_1.pageobject;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Label;

public class SamplePageObject extends BaseForm {

    private static Label labelSamplePage = new Label(By.id("sampleHeading"), "SamplePage Label");

    public SamplePageObject() {
        super(labelSamplePage, "SamplePage");
    }
}
