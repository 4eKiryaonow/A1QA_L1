package task2_1;

import org.testng.annotations.DataProvider;
import task2_1.utils.DataManager;
import task2_1.utils.JsonReader;

public class DataProviderTest {

    @DataProvider(name = "privacy policy")
    public static Object[][] getDataForPrivacyPolicy() {

        DataManager dataManager = new DataManager();
        String path = "src/test/resources/testdata/PrivacyPolicyTestData.json";
        dataManager.setLanguages(
                JsonReader.getListFromJsonFile(path,
                        "languages"));

        return new Object[][]{{dataManager}};

    }

    @DataProvider(name = "game search")
    public static Object[][] getDataForGameSearchTest() {
        DataManager dataManager = new DataManager();
        String pathTestData = "src/test/resources/testdata/GameSearchTestData.json";
        String pathSearchResults = "src/test/resources/testdata/GameSearchResults.json";

        dataManager.setQuery(
                JsonReader.getStringFromJsonFile(pathTestData,
                        "query"));
        dataManager.setPathFileToWrite(pathSearchResults);
        dataManager.setValueOfCompResults(Integer.parseInt(
                JsonReader.getStringFromJsonFile(pathTestData, "comparing-results")));
        dataManager.setPathFileToRead(pathSearchResults);
        return new Object[][]{{dataManager}};
    }
}
