package task3_1.pageobject;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Button;
import task3_1.element.Label;

public class AlertsPageObject extends BaseForm {

    private static Label labelAlerts = new Label(
            By.xpath("//div[@class='main-header'][contains(text(), 'Alerts')]"),
            "labelAlerts");


    public AlertsPageObject() {

        super(labelAlerts,"AlertsPageObject");
    }


}
