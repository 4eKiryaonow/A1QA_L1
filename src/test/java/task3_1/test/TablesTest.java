package task3_1.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task3_1.models.User;
import task3_1.pageobject.ElementsPageObject;
import task3_1.pageobject.MainPageObject;
import task3_1.pageobject.WebTablePageObject;
import task3_1.pageobject.component.RegistrationFormComponent;

public class TablesTest extends BaseTestClass {

    @Test(dataProvider = "Tables test", dataProviderClass = TestDataProvider.class)
    public void TablesTest(User user) {

        MainPageObject mainPageObject = new MainPageObject();
        mainPageObject.clickElementsBtn();
        ElementsPageObject elementsPageObject = new ElementsPageObject();
        elementsPageObject.LeftPanel().clickWebTables();
        WebTablePageObject webTablePageObject = new WebTablePageObject();
        Assert.assertTrue(webTablePageObject.formIsOpened(), "Page \"Web Table\" hasn't been opened");
        webTablePageObject.clickAddBtn();
        RegistrationFormComponent registrationForm = new RegistrationFormComponent();
        registrationForm.enterUser(user);
        Assert.assertFalse(registrationForm.formIsOpened(), "Registration form hasn't been closed");
        Assert.assertTrue(webTablePageObject.userTable().getListOfUsers().contains(user), "Table doesn't contain created user");
        webTablePageObject.userTable().deleteUserFromTable(user);
        Assert.assertFalse(webTablePageObject.userTable().getListOfUsers().contains(user), "User wasn't deleted");


    }
}
