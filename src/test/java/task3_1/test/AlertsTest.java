package task3_1.test;

import org.testng.annotations.Test;
import task3_1.pageobject.AlertsFrameWindowsPageObject;
import task3_1.pageobject.AlertsPageObject;
import task3_1.pageobject.MainPageObject;
import task3_1.utils.AlertUtil;

public class AlertsTest extends BaseTestClass {

    @Test
    public void AlertsTestScenario() throws InterruptedException {

        MainPageObject mainPageObject = new MainPageObject();
        AlertsFrameWindowsPageObject alertsFrameWindowsPageObject = mainPageObject.clickAlertsFrameWindowsBtn();
        AlertsPageObject alertsPageObject =  alertsFrameWindowsPageObject.LeftPanel().clickAlertsBtn();
        alertsPageObject.clickToSeeAlertBtn();
        AlertUtil.acceptAlert();
        alertsPageObject.clickConfirmBoxBtn();
        AlertUtil.acceptAlert();
        alertsPageObject.clickPromptBoxBtn();
        AlertUtil.SendTextToAlert("sdfsdf");
        AlertUtil.acceptAlert();
        Thread.sleep(10000);





    }
}
