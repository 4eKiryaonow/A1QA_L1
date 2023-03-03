package task3_1.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task3_1.models.User;
import task3_1.pageobject.ElementsPageObject;
import task3_1.pageobject.MainPageObject;
import task3_1.pageobject.WebTablePageObject;

public class TablesTest extends BaseTestClass {

    @Test(dataProvider = "Tables test", dataProviderClass = TestDataProvider.class)
    public void TablesTest(User user) throws InterruptedException {

        MainPageObject mainPageObject = new MainPageObject();
        mainPageObject.clickElementsBtn();
        ElementsPageObject elementsPageObject = new ElementsPageObject();
        elementsPageObject.LeftPanel().clickWebTables();
        WebTablePageObject webTablePageObject = new WebTablePageObject();
        Assert.assertTrue(webTablePageObject.formIsOpened(), "Page \"Web Table\" hasn't been opened");
        System.out.println(user);
        Thread.sleep(1000);



    }
}
