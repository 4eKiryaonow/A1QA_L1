package task3_1.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task3_1.pageobject.AlertsFrameWindowsPageObject;
import task3_1.pageobject.AlertsPageObject;
import task3_1.pageobject.MainPageObject;
import task3_1.util.StringGenerator;
import task3_1.utils.AlertUtil;

public class AlertsTest extends BaseTestClass {

    @Test
    public void AlertsTestScenario() throws InterruptedException {

        MainPageObject mainPageObject = new MainPageObject();
        AlertsFrameWindowsPageObject alertsFrameWindowsPageObject = mainPageObject.clickAlertsFrameWindowsBtn();
        AlertsPageObject alertsPageObject =  alertsFrameWindowsPageObject.LeftPanel().clickAlertsBtn();
        Assert.assertTrue(alertsPageObject.formIsOpened(), "Alerts page has not been opened");
        alertsPageObject.clickToSeeAlertBtn();
        Assert.assertEquals(AlertUtil.getAlertText(), "You clicked a button",
                "Alert with text 'You clicked a button' has not been open.");
        AlertUtil.acceptAlert();
        alertsPageObject.clickConfirmBoxBtn();
        AlertUtil.acceptAlert();
        alertsPageObject.clickPromptBoxBtn();
        AlertUtil.SendTextToAlert(StringGenerator.getRandomString());
        AlertUtil.acceptAlert();
        Thread.sleep(10000);
        System.out.println(alertsPageObject.getResultConfirmBoxBtn());
        System.out.println(alertsPageObject.getResultPromptBoxBtn());





    }
}
