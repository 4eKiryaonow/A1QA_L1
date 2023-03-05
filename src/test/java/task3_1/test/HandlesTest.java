package task3_1.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task3_1.pageobject.*;
import task3_1.utils.BrowserUtil;

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
        String browserWindowsPageTab = BrowserUtil.getCurrentTab();
        browserWindowsPageObject.clickTabBtn();
        BrowserUtil.switchToNewTab();
        SamplePageObject samplePageObject = new SamplePageObject();
        Assert.assertTrue(samplePageObject.formIsOpened(), "SamplePage hasn't been opened");
        BrowserUtil.closeCurrentTab();
        BrowserUtil.switchToCertainTab(browserWindowsPageTab);
        Assert.assertTrue(browserWindowsPageObject.formIsOpened());
        browserWindowsPageObject.leftPanel().clickLinks();
        LinksPageObject linksPageObject = new LinksPageObject();
        Assert.assertTrue(linksPageObject.formIsOpened(), "Links Page hasn't been opened");


        Thread.sleep(5000);

    }
}
