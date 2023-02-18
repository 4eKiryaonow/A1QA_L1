package task2_1;

import org.testng.Assert;
import org.testng.annotations.Test;
import task2_1.pageobject.MainPageObject;
import task2_1.pageobject.PrivacyPolicyPageObject;

public class PrivacyPolicyTest extends BaseTestClass {

    @Test
    public void privacyPolicyTest() {
        MainPageObject mainPageObject = new MainPageObject(driver);
        PrivacyPolicyPageObject privacyPolicyPageObject = mainPageObject.openPrivacyPolicyPage();


    }
}
