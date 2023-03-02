package task3_1.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task3_1.pageobject.AlertsFrameWindowsPageObject;
import task3_1.pageobject.MainPageObject;
import task3_1.pageobject.NestedFramesPageObject;
import task3_1.pageobject.component.ParentFrameComponent;

public class IframeTest extends BaseTestClass {

    @Test
    public void iFrameTest() throws InterruptedException {

        MainPageObject mainPageObject = new MainPageObject();
        Assert.assertTrue(mainPageObject.formIsOpened(), "\"Main page\" hasn't been opened");

        System.out.println("Step 2. Click  on \"Alerts, Frame & Windows\" button. In a menu click \"Nested Frames\" button");
        mainPageObject.clickAlertsFrameWindowsBtn();
        AlertsFrameWindowsPageObject alertsFrameWindowsPageObject = new AlertsFrameWindowsPageObject();
        alertsFrameWindowsPageObject.LeftPanel().clickNestedFrames();
        NestedFramesPageObject nestedFramesPageObject = new NestedFramesPageObject();
        Assert.assertTrue(nestedFramesPageObject.formIsOpened(), "Page \"Nested Frames\" hasn't been opened");
        ParentFrameComponent parentFrameComponent = new ParentFrameComponent();
        parentFrameComponent.switchToParentFrame();
        Assert.assertEquals(parentFrameComponent.getParentFrameText(), "Parent frame", "Text on the parent frame doesn't match");
        parentFrameComponent.childFrame().switchToChildFrame();
        Assert.assertEquals(parentFrameComponent.getChildFrameText(), "Child Iframe", "Text on the child frame doesn't match");
        parentFrameComponent.leaveFrame();
        System.out.println("Step 3. Select \"Frames\" option in a left menu");
        nestedFramesPageObject.leftPanel().clickFramesBtn();
        Thread.sleep(3000);





    }
}
