package task3_1.test;

import org.openqa.selenium.json.Json;
import org.testng.annotations.DataProvider;
import task3_1.util.JsonReader;
import task3_1.util.StringGenerator;
import task3_1.util.TestDataManager;


public class TestDataProvider {

    @DataProvider(name = "Alerts test")
    public static Object[][] DataProviderAlertsTest() {

        String path = "src/test/resources/testdata/AlertsTestData.json";

        TestDataManager data = new TestDataManager();
        data.setSeeAlertText(JsonReader.getStringFromJsonFile(path,"seeAlertText"));
        data.setConfirmAlertText(JsonReader.getStringFromJsonFile(path,"confirmAlertText"));
        data.setResultConfirmAlertText(JsonReader.getStringFromJsonFile(path,"resultConfirmAlertText"));
        data.setPromptBoxAlertText(JsonReader.getStringFromJsonFile(path,"promptBoxAlertText"));
        data.setRandomString(StringGenerator.getRandomString());

        return new Object[][] {{data}};
    }

    @DataProvider(name = "Iframe test")
    public static Object[][] DataProviderIframeTest() {

        String path = "src/test/resources/testdata/IframeTestData.json";
        TestDataManager data = new TestDataManager();
        data.setParentFrameText(JsonReader.getStringFromJsonFile(path, "parentFrameText"));
        data.setChildFrameText(JsonReader.getStringFromJsonFile(path, "childFrameText"));

        return new Object[][] {{data}};
    }

}
