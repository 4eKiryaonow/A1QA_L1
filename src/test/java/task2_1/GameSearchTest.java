package task2_1;

import org.testng.Assert;
import org.testng.annotations.Test;
import task2_1.entity.GameResult;
import task2_1.pageobject.MainPageObject;
import task2_1.pageobject.SearchPageObject;
import task2_1.utils.DataManager;
import task2_1.utils.JsonReader;

import java.util.List;

public class GameSearchTest extends BaseTestClass {

    @Test(dataProvider = "game search", dataProviderClass = DataProviderTest.class)
    public void gameSearchTest(DataManager dataManager) {
        MainPageObject mainPageObject = new MainPageObject(driver);
        SearchPageObject searchPageObject = mainPageObject.menu().performSearchQuery(dataManager.getQuery());

        Assert.assertTrue(searchPageObject.SearchPageIsOpen(), "Search Page has not been opened");
        Assert.assertEquals(searchPageObject.getSearchQuery(), dataManager.getQuery(),
                "Actual value in the search box doesn't match with expected");
        Assert.assertEquals(searchPageObject.getTitleOfSearchResult(0), dataManager.getQuery(),
                "The first name of position is not equal to searched name.");
        List<GameResult> gameResultFirstList = searchPageObject.getSearchResults();

        JsonReader.writeSearchResult(dataManager.getPathFileToWrite(), searchPageObject.getFirstAndSecondResults());

        String titleOfSecondResult = searchPageObject.getTitleOfSearchResult(1);

        searchPageObject = searchPageObject.menu().performSearchQuery(titleOfSecondResult);
        Assert.assertEquals(searchPageObject.getSearchQuery(), titleOfSecondResult,
                "Actual value in the search box doesn't match with expected");
        List<GameResult> gameResultSecondList = searchPageObject.getSearchResults();

        Assert.assertEquals(
                gameResultSecondList
                        .stream()
                        .filter(gameResultFirstList::contains)
                        .count(),
                dataManager.getValueOfCompResults(),
                "Result should contains 2 stored items form previous result"
        );

    }
}
