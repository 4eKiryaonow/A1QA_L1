package task2_1;

import org.testng.Assert;
import org.testng.annotations.Test;
import task2_1.pageobject.MainPageObject;
import task2_1.pageobject.PrivacyPolicyPageObject;
import task2_1.utils.DataManager;

import java.time.LocalDate;

public class PrivacyPolicyTest extends BaseTestClass {

    @Test(dataProvider = "privacy policy", dataProviderClass = DataProviderTest.class)
    public void privacyPolicyTest(DataManager dataManager) {
        MainPageObject mainPageObject = new MainPageObject(driver);
        mainPageObject.openPrivacyPolicyPage();
        PrivacyPolicyPageObject privacyPolicyPageObject = new PrivacyPolicyPageObject(driver);


        Assert.assertTrue(privacyPolicyPageObject.PrivacyPolicyIsOpened(),
                "Privacy Policy Page is not opened" +
                        "\nSwitch languages table is not displayed.");
        Assert.assertEquals(privacyPolicyPageObject.getListOfLanguages(), dataManager.getLanguages(),
                "List of languages on the Policy Page doesn't match with test data: \n" +
                        dataManager.getLanguages());
        Assert.assertTrue(privacyPolicyPageObject
                        .getTextOfPrivacyPolicy()
                        .contains(String.valueOf(LocalDate.now().getYear())),
                "The Policy revision is not signed in the current year");
    }
}
