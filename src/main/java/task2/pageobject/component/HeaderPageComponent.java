package task2.pageobject.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPageComponent extends AbstractBaseComponent {

    @FindBy(css = "a.global_action_link")
    private WebElement loginButton;

    public HeaderPageComponent(WebDriver driver) {
        super(driver);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }


}
