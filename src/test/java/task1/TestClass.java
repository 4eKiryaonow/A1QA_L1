package task1;

import entity.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestClass extends BaseTest {


    @Test(dataProvider = "set1", dataProviderClass = DataProviderTest.class)
    public void validateJsonFileContainsListOfUsers(ArrayList<User> list) {

        Assert.assertEquals(list.size(), validateServiceClass.checkUserHaveIdAndName(list),
                "Json file consists users which has no ID or Name");


    }
}
