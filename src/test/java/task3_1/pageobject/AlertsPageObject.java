package task3_1.pageobject;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Button;
import task3_1.element.Label;
import task3_1.utils.ConditionalWait;

public class AlertsPageObject extends BaseForm {

    private static Label labelAlerts = new Label(
            By.xpath("//div[@class='main-header'][contains(text(), 'Alerts')]"),
            "labelAlerts");
    private Button toSeeAlertBtn = new Button(By.id("alertButton"), "ToSeeAlertBtn");
    private Button timerAlertButton = new Button(By.id("timerAlertButton"), "TimerAlertButton");
    private Button confirmBoxBtn = new Button(By.id("confirmButton"), "Confirm Button");
    private Button promptBoxBtn = new Button(By.id("promtButton"), "PromptButton");
    private Label resultOfConfirmBoxBtn = new Label(By.id("confirmResult"),"ConfirmResultConfirmBox");
    private Label resultOfPromptBoxBtn = new Label(By.id("promptResult"),"ConfirmResultPromptBoxBtn");



    public AlertsPageObject() {

        super(labelAlerts,"AlertsPageObject");
    }
    public void clickToSeeAlertBtn() {

        toSeeAlertBtn.clickElement();
    }

    public AlertsPageObject clickConfirmBoxBtn() {

        confirmBoxBtn.clickElement();
        return this;

    }
    public void clickPromptBoxBtn() {

        promptBoxBtn.clickElement();
    }
    public String getResultConfirmBoxBtn() {

        return resultOfConfirmBoxBtn.getTextOfElement();
    }
    public String getResultPromptBoxBtn() {

        return resultOfPromptBoxBtn.getTextOfElement();
    }


}
