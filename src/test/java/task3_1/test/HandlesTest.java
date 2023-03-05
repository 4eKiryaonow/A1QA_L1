package task3_1.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task3_1.pageobject.AlertsFrameWindowsPageObject;
import task3_1.pageobject.BrowserWindowsPageObject;
import task3_1.pageobject.MainPageObject;

public class HandlesTest extends BaseTestClass {

    @Test
    public static void handlesTest() throws InterruptedException {

        MainPageObject mainPageObject = new MainPageObject();
        Assert.assertTrue(mainPageObject.formIsOpened(), "Main page hasn't been opened");
        mainPageObject.clickAlertsFrameWindowsBtn();
        AlertsFrameWindowsPageObject alertsFrameWindowsPageObject = new AlertsFrameWindowsPageObject();
        alertsFrameWindowsPageObject.LeftPanel().clickWindowsBrowser();
        BrowserWindowsPageObject browserWindowsPageObject = new BrowserWindowsPageObject();
        Assert.assertTrue(browserWindowsPageObject.formIsOpened(), "BrowserWindows page hasn't been opened");
        browserWindowsPageObject.clickTabBtn();
        Thread.sleep(5000);

    }
}
