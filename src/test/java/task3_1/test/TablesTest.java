package task3_1.test;

import org.testng.annotations.Test;
import task3_1.pageobject.MainPageObject;

public class TablesTest extends BaseTestClass {

    @Test
    public void TablesTest() throws InterruptedException {

        MainPageObject mainPageObject = new MainPageObject();
        mainPageObject.clickElementsBtn();
        Thread.sleep(1000);



    }
}
