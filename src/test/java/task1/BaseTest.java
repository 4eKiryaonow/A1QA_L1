package task1;

import org.testng.annotations.*;
import service.ValidateServiceClass;

public abstract class BaseTest {

    protected ValidateServiceClass validateServiceClass;

    @BeforeClass
    public void setUP() {
        validateServiceClass = new ValidateServiceClass();
    }

    @AfterClass
    public void tierDown() {
        validateServiceClass = null;
    }

}
