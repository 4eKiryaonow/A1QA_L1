package task3_1.test;

import org.testng.annotations.Test;
import task3_1.pageobject.AlertsFrameWindowsPageObject;
import task3_1.pageobject.MainPageObject;

public class AlertsTest extends BaseTestClass {

    @Test
    public void AlertsTestScenario() throws InterruptedException {

        MainPageObject mainPageObject = new MainPageObject();
        AlertsFrameWindowsPageObject alertsFrameWindowsPageObject = mainPageObject.clickAlertsFrameWindowsBtn();
        alertsFrameWindowsPageObject.LeftPanel().clickAlertsBtn();
        Thread.sleep(1000);




    }
}
