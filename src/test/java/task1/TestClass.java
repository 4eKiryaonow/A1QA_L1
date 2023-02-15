package task1;

import entity.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestClass extends BaseTest {


    @Test(dataProvider = "test1", dataProviderClass = DataProviderTest.class)
    public void checkJsonFileContainsListOfUsers(ArrayList<User> list) {

        Assert.assertEquals(list.size(), validateServiceClass.checkUserHaveIdAndName(list),
                "Json file consists users which has no ID or Name");

    }

    @Test(dataProvider = "test2", dataProviderClass = DataProviderTest.class)
    public void checkYamlFileContainsListOfUser(ArrayList<User> list) {

        Assert.assertEquals(list.size(), validateServiceClass.checkUserHaveIdAndName(list),
                "Yaml file consists users which has no ID or Name");
    }

    @Test(dataProvider = "test3", dataProviderClass = DataProviderTest.class)
    public void checkJsonAllUsersContainsInYaml(List<User> jsonList, List<User> yamlList) {

        Assert.assertTrue(yamlList.containsAll(jsonList), "Not all users from json are in yaml file");

    }
}
