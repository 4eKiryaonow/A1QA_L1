package task3_1.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task3_1.pageobject.ElementsPageObject;
import task3_1.pageobject.MainPageObject;
import task3_1.pageobject.WebTablePageObject;

public class TablesTest extends BaseTestClass {

    @Test
    public void TablesTest() throws InterruptedException {

        MainPageObject mainPageObject = new MainPageObject();
        mainPageObject.clickElementsBtn();
        ElementsPageObject elementsPageObject = new ElementsPageObject();
        elementsPageObject.LeftPanel().clickWebTables();
        WebTablePageObject webTablePageObject = new WebTablePageObject();
        Assert.assertTrue(webTablePageObject.formIsOpened(), "Page \"Web Table\" hasn't been opened");
        Thread.sleep(1000);



    }
}
