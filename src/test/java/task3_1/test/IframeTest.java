package task3_1.test;

import org.testng.annotations.Test;
import task3_1.pageobject.MainPageObject;

public class IframeTest {

    @Test
    public void iFrameTest() {

        System.out.println("Step 2. Click  on \"Alerts, Frame & Windows\" button. In a menu click \"Nested Frames\" button");
        MainPageObject mainPageObject = new MainPageObject();
        mainPageObject.clickAlertsFrameWindowsBtn();

    }
}
