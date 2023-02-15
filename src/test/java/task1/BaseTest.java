package task1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import service.ValidateServiceClass;

public abstract class BaseTest {

    protected ValidateServiceClass validateServiceClass;

    @BeforeClass
    public void setUP() {
        validateServiceClass = new ValidateServiceClass();
    }


}
