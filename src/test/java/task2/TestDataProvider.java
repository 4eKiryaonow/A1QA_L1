package task2;

import org.testng.annotations.DataProvider;
import task2.utils.DataManager;

public class TestDataProvider {

    @DataProvider(name = "InvalidLogin")
    public static Object[][] getDataForFirstEx() {

        DataManager data = new DataManager();
        data.setLogin();
        data.setPassword();

        return new Object[][]{{data}};
    }
}
