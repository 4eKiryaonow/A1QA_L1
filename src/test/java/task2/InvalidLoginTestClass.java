package task2;

import org.testng.Assert;
import org.testng.annotations.Test;
import task2.pageobject.LoginPageObject;
import task2.pageobject.MainPageObject;
import task2.utils.DataManager;

public class InvalidLoginTestClass extends SeleniumBaseClass {
    @Test(dataProvider = "InvalidLogin", dataProviderClass = TestDataProvider.class)
    public void InvalidLoginScenario(DataManager data) {
        MainPageObject mainPageObject = new MainPageObject(driver);
        Assert.assertTrue(mainPageObject.menu().getSearchFiled().isDisplayed(), "Main Page haven't been loaded");
        mainPageObject.header().clickLoginButton();

        LoginPageObject loginPageObject = new LoginPageObject(driver);
        Assert.assertTrue(loginPageObject.getSubmitButton().isDisplayed(), "Login Page haven't been loaded");
        loginPageObject.login(data.getLogin(), data.getPassword());
        Assert.assertTrue(loginPageObject.getIconLoading().isDisplayed(), "Loading element is not displayed");
        Assert.assertTrue(loginPageObject.getTextErrorMessage().isDisplayed(), "Error message is not displayed");




    }
}
