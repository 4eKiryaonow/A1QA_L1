package task2_0.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPageObject {

    protected WebDriver driver;

    protected AbstractPageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);

    }


}
