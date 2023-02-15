package task1;

import entity.User;
import org.testng.annotations.DataProvider;
import reader.JsonReader;
import reader.YamlReader;

import java.util.ArrayList;
import java.util.List;

public class DataProviderTest {


    @DataProvider(name = "set1")
    public static Object[][] getDataForTest1() {
        List<User> listData1 = new ArrayList<>(
                JsonReader.getDataFromJsonFile("src/test/resources/admin_users.json"));
        List<User> listData2 = new ArrayList<>(
                JsonReader.getDataFromJsonFile("src/test/resources/regular_users.json"));

        return new Object[][] {
                {listData1},
                {listData2}
        };
    }

    @DataProvider(name = "set2")
    public static Object[][] getDataForTest2() {
        List<User> listData1 = new ArrayList<>(
                YamlReader.getDataFromYamlFile("src/test/resources/admin_users.yaml"));
        List<User> listData2 = new ArrayList<>(
                YamlReader.getDataFromYamlFile("src/test/resources/regular_users.yaml"));

        return new Object[][] {
                {listData1},
                {listData2}
        };
    }

    @DataProvider(name = "set3")
    public static Object[][] getDataForTest3() {
        List<User> listJson1 = new ArrayList<>(
                JsonReader.getDataFromJsonFile("src/test/resources/admin_users.json"));
        List<User> listJson2 = new ArrayList<>(
                JsonReader.getDataFromJsonFile("src/test/resources/regular_users.json"));
        List<User> listYaml1 = new ArrayList<>(
                YamlReader.getDataFromYamlFile("src/test/resources/admin_users.yaml"));
        List<User> listYaml2 = new ArrayList<>(
                YamlReader.getDataFromYamlFile("src/test/resources/regular_users.yaml"));

        return new Object[][] {
                {listJson1, listYaml1},
                {listJson2, listYaml2}
        };

    }
}

