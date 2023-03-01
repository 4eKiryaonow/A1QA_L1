package task3_1.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task3_1.pageobject.AlertsFrameWindowsPageObject;
import task3_1.pageobject.AlertsPageObject;
import task3_1.pageobject.MainPageObject;
import task3_1.util.StringGenerator;
import task3_1.util.TestDataManager;
import task3_1.utils.AlertUtil;

public class AlertsTest extends BaseTestClass {

    @Test(dataProvider = "Alerts test", dataProviderClass = TestDataProvider.class)
    public void AlertsTestScenario(TestDataManager data) throws InterruptedException {

        MainPageObject mainPageObject = new MainPageObject();
        Assert.assertTrue(mainPageObject.formIsOpened(), "Main page hasn't been opened");

        System.out.println("Step 2. Click on Alerts, Frame & Windows button. In a menu click Alerts button.");
        mainPageObject.clickAlertsFrameWindowsBtn();
        AlertsFrameWindowsPageObject alertsFrameWindowsPageObject = new AlertsFrameWindowsPageObject();
        alertsFrameWindowsPageObject.LeftPanel().clickAlertsBtn();
        AlertsPageObject alertsPageObject = new AlertsPageObject();
        Assert.assertTrue(alertsPageObject.formIsOpened(), "Alerts page has not been opened");

        System.out.println("Step 3. Click on \"Click button to see alert\" button.");
        alertsPageObject.clickToSeeAlertBtn();
        Assert.assertEquals(AlertUtil.getAlertText(), data.getSeeAlertText(),
                String.format("Alert with text \"%s\" has not been open.", data.getSeeAlertText()));

        System.out.println("Step 4. Click on \"OK\" button");
        AlertUtil.acceptAlert();
        Assert.assertFalse(AlertUtil.alertIsPresent(), "Alert has not been closed");

        System.out.println("Step 5. Click on \"On button click, confirm box will appear\" button");
        alertsPageObject.clickConfirmBoxBtn();
        Assert.assertEquals(AlertUtil.getAlertText(), data.getConfirmAlertText(),
                String.format("Alert with text \"%s\" has not been opened", data.getConfirmAlertText()));

        System.out.println("Step 6. Click on \"OK\" button");
        AlertUtil.acceptAlert();
        Assert.assertFalse(AlertUtil.alertIsPresent(), "Alert has not been opened");
        Assert.assertEquals(alertsPageObject.getResultConfirmBoxBtn(), data.getResultConfirmAlertText(),
                String.format("Text \"%s\" doesn't appear om the page", data.getResultConfirmAlertText()));

        System.out.println("Step 7. Click on \"On button click, prompt box will appear\" button");
        alertsPageObject.clickPromptBoxBtn();
        Assert.assertEquals(AlertUtil.getAlertText(), data.getPromptBoxAlertText(),
                String.format("Alert with text \"%s\" hasn't been opened", data.getPromptBoxAlertText()));

        System.out.println("Step 8. Enter randomly generated text, click \"OK\" button");
        AlertUtil.SendTextToAlert(data.getRandomString());
        AlertUtil.acceptAlert();
        Assert.assertFalse(AlertUtil.alertIsPresent());
        Assert.assertTrue(alertsPageObject.getResultPromptBoxBtn().contains(data.getRandomString()), String.format(
                        "Appeared text on the page doesn't equal random generated text: \"%s\"", data.getRandomString()));
    }
}
