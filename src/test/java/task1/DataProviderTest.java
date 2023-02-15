package task1;

import entity.User;
import org.testng.annotations.DataProvider;
import reader.JsonReader;

import java.util.ArrayList;
import java.util.List;

public class DataProviderTest {


    @DataProvider(name = "set1")
    public static Object[][] getDataForTest() {
        List<User> listData1 = new ArrayList<>(JsonReader.getDataFromJsonFile(
                "src/test/resources/admin_users.json"));
        List<User> listData2 = new ArrayList<>(JsonReader.getDataFromJsonFile(
                "src/test/resources/regular_users.json"));


        return new Object[][] {
                {listData1},
                {listData2}
        };
    }
}

