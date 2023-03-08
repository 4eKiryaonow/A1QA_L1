package task3_1.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import task3_1.models.User;
import task3_1.pageobject.ElementsPageObject;
import task3_1.pageobject.MainPageObject;
import task3_1.pageobject.WebTablePageObject;
import task3_1.pageobject.component.RegistrationFormComponent;
import task3_1.utils.InfoLogger;

public class TablesTest extends BaseTestClass {

    @Test(testName = "Tables", dataProvider = "Tables test", dataProviderClass = TestDataProvider.class)
    public void tablesTest(User user) {

        InfoLogger.info(String.format("Test \"Alerts\" starts with data: %s",user.toString()));

        InfoLogger.info("Step 1. Navigate to Main Page");
        MainPageObject mainPageObject = new MainPageObject();
        Assert.assertTrue(mainPageObject.formIsOpened(), "Main Page hasn't been opened");

        InfoLogger.info("Step 2. Click on \"Elements\" button. In the menu click a \"Web Tables\" button");
        mainPageObject.clickElementsBtn();
        ElementsPageObject elementsPageObject = new ElementsPageObject();
        elementsPageObject.LeftPanel().scrollThenClickWebTablesBtn();
        WebTablePageObject webTablePageObject = new WebTablePageObject();
        Assert.assertTrue(webTablePageObject.formIsOpened(), "Page \"Web Table\" hasn't been opened");

        InfoLogger.info("Step 3. Click on \"Add\" button");
        webTablePageObject.clickAddBtn();
        RegistrationFormComponent registrationForm = new RegistrationFormComponent();
        Assert.assertTrue(registrationForm.formIsOpened(), "Registration form hasn't appeared on the page");

        InfoLogger.info(String.format("Step 4. Enter data for User: %s and then click \"Submit\" button", user.toString()));
        registrationForm.enterUser(user);
        Assert.assertFalse(registrationForm.formIsOpened(), "Registration form hasn't been closed");
        Assert.assertTrue(webTablePageObject.userTable().getListOfUsers().contains(user), "Table doesn't contain created user");

        InfoLogger.info(String.format("Step 5. Click \"Delete\" button in a row which contains data of User: %s", user.toString()));
        int numberRecords = webTablePageObject.userTable().getNumberOfUsers();
        webTablePageObject.userTable().deleteUserFromTable(user);
        Assert.assertNotEquals(webTablePageObject.userTable().getNumberOfUsers(), numberRecords, "Number of records in table hasn't changed");
        Assert.assertFalse(webTablePageObject.userTable().getListOfUsers().contains(user), "User wasn't deleted");

        InfoLogger.info("Test \"Tables\" is finished.");

    }
}
