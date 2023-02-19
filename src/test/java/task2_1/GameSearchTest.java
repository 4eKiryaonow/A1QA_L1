package task2_1;

import org.testng.Assert;
import org.testng.annotations.Test;
import task2_1.pageobject.MainPageObject;
import task2_1.pageobject.SearchPageObject;
import task2_1.utils.DataManager;

public class GameSearchTest extends BaseTestClass {

    @Test(dataProvider = "game search", dataProviderClass = DataProviderTest.class)
    public void gameSearchTest(DataManager dataManager) {
        MainPageObject mainPageObject = new MainPageObject(driver);
        SearchPageObject searchPageObject = mainPageObject.menu().performSearchQuery(dataManager.getQuery());
        Assert.assertTrue(searchPageObject.SearchPageIsOpen(), "Search Page has npt been opened");
        Assert.assertEquals(searchPageObject.getSearchQuery(), dataManager.getQuery(),
                "Actual value in search box doesn't match with expected");
        Assert.assertEquals(searchPageObject.getSearchResult(0), dataManager.getQuery(),
                "The first name of position is not equal to searched name.");

    }
}
