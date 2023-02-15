package task1;

import entity.User;
import org.testng.annotations.DataProvider;
import reader.JsonReader;
import reader.PropertiesReader;
import reader.YamlReader;

import java.util.ArrayList;
import java.util.List;

public class DataProviderTest {


    @DataProvider(name = "test1")
    public static Object[][] getDataForTest1() {
        List<User> listData1 = new ArrayList<>(
                JsonReader.getDataFromJsonFile(PropertiesReader.getProperty("jsonSet1")));
        List<User> listData2 = new ArrayList<>(
                JsonReader.getDataFromJsonFile(PropertiesReader.getProperty("jsonSet2")));

        return new Object[][]{
                {listData1},
                {listData2}
        };
    }

    @DataProvider(name = "test2")
    public static Object[][] getDataForTest2() {
        List<User> listData1 = new ArrayList<>(
                YamlReader.getDataFromYamlFile(PropertiesReader.getProperty("yamlSet1")));
        List<User> listData2 = new ArrayList<>(
                YamlReader.getDataFromYamlFile(PropertiesReader.getProperty("yamlSet2")));

        return new Object[][]{
                {listData1},
                {listData2}
        };
    }

    @DataProvider(name = "test3")
    public static Object[][] getDataForTest3() {
        List<User> listJson1 = new ArrayList<>(
                JsonReader.getDataFromJsonFile(PropertiesReader.getProperty("jsonSet1")));
        List<User> listJson2 = new ArrayList<>(
                JsonReader.getDataFromJsonFile(PropertiesReader.getProperty("jsonSet2")));
        List<User> listYaml1 = new ArrayList<>(
                YamlReader.getDataFromYamlFile(PropertiesReader.getProperty("yamlSet1")));
        List<User> listYaml2 = new ArrayList<>(
                YamlReader.getDataFromYamlFile(PropertiesReader.getProperty("yamlSet2")));

        return new Object[][]{
                {listJson1, listYaml1},
                {listJson2, listYaml2}
        };

    }
}

