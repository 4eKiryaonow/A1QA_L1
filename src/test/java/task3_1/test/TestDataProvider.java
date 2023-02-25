package task3_1.test;

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

}
