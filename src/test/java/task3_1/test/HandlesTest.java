package task3_1.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task3_1.pageobject.*;
import task3_1.utils.BrowserUtil;
import task3_1.utils.InfoLogger;

public class HandlesTest extends BaseTestClass {

    @Test(testName = "Handles")
    public static void handlesTest() {

        InfoLogger.info("Test \"Handles\" starts");

        InfoLogger.info("Step 1. Navigate to Main Page");
        MainPageObject mainPageObject = new MainPageObject();
        Assert.assertTrue(mainPageObject.formIsOpened(), "Main page hasn't been opened");

        InfoLogger.info("Step 2. Click on \"Alerts, Frame & Windows\" button. In the menu click a \"Browser Windows\" button");
        mainPageObject.clickAlertsFrameWindowsBtn();
        AlertsFrameWindowsPageObject alertsFrameWindowsPageObject = new AlertsFrameWindowsPageObject();
        alertsFrameWindowsPageObject.LeftPanel().clickWindowsBrowser();
        BrowserWindowsPageObject browserWindowsPageObject = new BrowserWindowsPageObject();
        Assert.assertTrue(browserWindowsPageObject.formIsOpened(), "BrowserWindows page hasn't been opened");

        InfoLogger.info("Step 3. Click on \"New Tab\" button.");
        String currentTab = BrowserUtil.getCurrentTab();
        browserWindowsPageObject.clickTabBtn();
        BrowserUtil.switchToNewTab();
        SamplePageObject samplePageObject = new SamplePageObject();
        Assert.assertTrue(samplePageObject.formIsOpened(), "SamplePage hasn't been opened");

        InfoLogger.info("Step 4. Close current tab");
        BrowserUtil.closeCurrentTab();
        BrowserUtil.switchToCertainTab(currentTab);
        Assert.assertTrue(browserWindowsPageObject.formIsOpened(), "Browser Window page hasn't been opened");

        InfoLogger.info("Step 5. In the menu on the left click \"Elements\" -> \"Links\" button");
        browserWindowsPageObject.leftPanel().clickElements();
        browserWindowsPageObject.leftPanel().clickLinks();
        LinksPageObject linksPageObject = new LinksPageObject();
        Assert.assertTrue(linksPageObject.formIsOpened(), "Links Page hasn't been opened");

        InfoLogger.info("Step 6. Click \"Home\" link");
        currentTab = BrowserUtil.getCurrentTab();
        linksPageObject.clickLinkHome();
        BrowserUtil.switchToNewTab();
        Assert.assertTrue(mainPageObject.formIsOpened(), "New tab with Main Page hasn't been opened");

        InfoLogger.info("Step 7. Resume to previous tab");
        BrowserUtil.switchToCertainTab(currentTab);
        Assert.assertTrue(linksPageObject.formIsOpened(), "Page Links hasn't been opened");

        InfoLogger.info("Test \"Handles\" is finished.");

    }
}
