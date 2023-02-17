package task2_0;

import org.testng.Assert;
import org.testng.annotations.Test;
import task2_0.pageobject.MainPageObject;

public class InvalidLoginTestClass extends SeleniumBaseClass {

    @Test
    public void InvalidLoginScenario() throws InterruptedException {
        MainPageObject mainPageObject = new MainPageObject(driver);
        Assert.assertEquals(mainPageObject.getUrl(), "https://store.steampowered.com/");
        mainPageObject.header().clickLoginButton();



    }
}
