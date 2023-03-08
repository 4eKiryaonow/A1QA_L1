package task3_1.test;

import org.testng.annotations.DataProvider;
import task3_1.models.User;
import task3_1.util.JsonReader;
import task3_1.util.StringGenerator;
import task3_1.util.TestDataManager;

import java.util.ArrayList;
import java.util.List;


public class TestDataProvider {

    @DataProvider(name = "Alerts test")
    public static Object[][] DataProviderAlertsTest() {

        String path = "src/test/resources/testdata/AlertsTestData.json";

        TestDataManager data = new TestDataManager();
        data.setSeeAlertText(JsonReader.getStringFromJsonFile(path,"seeAlertText"));
        data.setConfirmAlertText(JsonReader.getStringFromJsonFile(path,"confirmAlertText"));
        data.setResultConfirmAlertText(JsonReader.getStringFromJsonFile(path,"resultConfirmAlertText"));
        data.setPromptBoxAlertText(JsonReader.getStringFromJsonFile(path,"promptBoxAlertText"));
        data.setLengthRandomString(Integer.parseInt(JsonReader.getStringFromJsonFile(path,"lengthRandomString")));
        data.setRandomString(StringGenerator.getRandomString(data.getLengthRandomString()));

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

    @DataProvider(name = "Tables test")
    public static Object[][] DataProviderTablesTest() {

        String path = "src/test/resources/testdata/TablesTestData.json";
        List<User> userList = new ArrayList<>(JsonReader.getUserDataFromJsonFile(path).values());
        Object[][] objects = new Object[userList.size()][];

        for (int i = 0; i < userList.size(); i++) {

            objects[i] = new Object[1];
            objects[i][0] = userList.get(i);
        }
        return objects;
    }
}
