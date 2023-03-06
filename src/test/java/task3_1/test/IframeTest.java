package task3_1.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task3_1.pageobject.AlertsFrameWindowsPageObject;
import task3_1.pageobject.FramesPageObject;
import task3_1.pageobject.MainPageObject;
import task3_1.pageobject.NestedFramesPageObject;
import task3_1.pageobject.component.BottomFrame;
import task3_1.pageobject.component.ParentFrameComponent;
import task3_1.pageobject.component.TopFrame;
import task3_1.util.TestDataManager;
import task3_1.utils.InfoLogger;

public class IframeTest extends BaseTestClass {

    @Test(testName = "Iframe",
            dataProvider = "Iframe test", dataProviderClass = TestDataProvider.class)
    public void iFrameTest(TestDataManager data) {
        InfoLogger.info("Test \"Iframe\" starts");

        InfoLogger.info("Step 1. Navigate to Main Page");
        MainPageObject mainPageObject = new MainPageObject();
        Assert.assertTrue(mainPageObject.formIsOpened(), "\"Main page\" hasn't been opened");

        InfoLogger.info("Step 2. Click  on \"Alerts, Frame & Windows\" button. In a menu click \"Nested Frames\" button");
        mainPageObject.clickAlertsFrameWindowsBtn();
        AlertsFrameWindowsPageObject alertsFrameWindowsPageObject = new AlertsFrameWindowsPageObject();
        alertsFrameWindowsPageObject.LeftPanel().clickNestedFrames();
        NestedFramesPageObject nestedFramesPageObject = new NestedFramesPageObject();
        Assert.assertTrue(nestedFramesPageObject.formIsOpened(), "Page \"Nested Frames\" hasn't been opened");
        ParentFrameComponent parentFrameComponent = new ParentFrameComponent();
        parentFrameComponent.switchToParentFrame();
        Assert.assertEquals(parentFrameComponent.getParentFrameText(), data.getParentFrameText(), "Text on the parent frame doesn't match");
        parentFrameComponent.childFrame().switchToChildFrame();
        Assert.assertEquals(parentFrameComponent.getChildFrameText(), data.getChildFrameText(), "Text on the child frame doesn't match");
        parentFrameComponent.leaveFrame();

        InfoLogger.info("Step 3. Select \"Frames\" option in a left menu");
        nestedFramesPageObject.leftPanel().clickFramesBtn();
        FramesPageObject framesPageObject = new FramesPageObject();
        Assert.assertTrue(framesPageObject.formIsOpened(), "Page \"Frames\" hasn't been opened");
        TopFrame topFrame = new TopFrame();
        topFrame.switchToFrame();
        String topFrameText = topFrame.getTopLabelText();
        topFrame.leaveFrame();
        BottomFrame bottomFrame = new BottomFrame();
        bottomFrame.switchToFrame();
        String bottomFrameText = bottomFrame.getBottomFrameText();
        Assert.assertTrue(topFrameText.equals(bottomFrameText), "Text is not equals for both frames");

        InfoLogger.info("Test \"Iframe\" is finished.");

    }
}
