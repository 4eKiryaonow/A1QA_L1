package task2_0;

import org.testng.Assert;
import org.testng.annotations.Test;
import task2_0.pageobject.LoginPageObject;
import task2_0.pageobject.MainPageObject;

public class InvalidLoginTestClass extends SeleniumBaseClass {

    @Test
    public void InvalidLoginScenario() throws InterruptedException {
        MainPageObject mainPageObject = new MainPageObject(driver);
        Assert.assertTrue(mainPageObject.menu().getSearchFiled().isDisplayed(), "Main Page haven't been loaded");
        mainPageObject.header().clickLoginButton();

        LoginPageObject loginPageObject = new LoginPageObject(driver);
        loginPageObject.login("sdfsdfsdf", "sdfsdfsdf");
        Assert.assertTrue(loginPageObject.getIconLoading().isDisplayed(), "Loading element is not displayed");




    }
}
