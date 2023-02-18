package task2;

import org.testng.Assert;
import org.testng.annotations.Test;
import task2.pageobject.LoginPageObject;
import task2.pageobject.MainPageObject;

public class InvalidLoginTestClass extends SeleniumBaseClass {
    @Test
    public void InvalidLoginScenario() {
        MainPageObject mainPageObject = new MainPageObject(driver);
        Assert.assertTrue(mainPageObject.menu().getSearchFiled().isDisplayed(), "Main Page haven't been loaded");
        mainPageObject.header().clickLoginButton();

        LoginPageObject loginPageObject = new LoginPageObject(driver);
        loginPageObject.login("sdfsdfsdf", "sdfsdfsdf");
        Assert.assertTrue(loginPageObject.getIconLoading().isDisplayed(), "Loading element is not displayed");
        Assert.assertTrue(loginPageObject.getTextErrorMessage().isDisplayed(), "Error message is not displayed");




    }
}
