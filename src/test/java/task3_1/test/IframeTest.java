package task3_1.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task3_1.pageobject.AlertsFrameWindowsPageObject;
import task3_1.pageobject.MainPageObject;
import task3_1.pageobject.NestedFramesPageObject;

public class IframeTest extends BaseTestClass {

    @Test
    public void iFrameTest() {

        MainPageObject mainPageObject = new MainPageObject();
        Assert.assertTrue(mainPageObject.formIsOpened(), "\"Main page\" hasn't been opened");

        System.out.println("Step 2. Click  on \"Alerts, Frame & Windows\" button. In a menu click \"Nested Frames\" button");
        mainPageObject.clickAlertsFrameWindowsBtn();
        AlertsFrameWindowsPageObject alertsFrameWindowsPageObject = new AlertsFrameWindowsPageObject();
        alertsFrameWindowsPageObject.LeftPanel().clickNestedFrames();
        NestedFramesPageObject nestedFramesPageObject = new NestedFramesPageObject();
        Assert.assertTrue(nestedFramesPageObject.formIsOpened(), "Page \"Nested Frames\" hasn't been opened");
        //add assert about messages Parent frame and Children frame


    }
}
