package task2_1.pageobject.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPageComponent extends AbstractBaseComponent {
    private WebElement loginButton = driver.findElement(By.cssSelector("a.global_action_link"));

    public HeaderPageComponent(WebDriver driver) {
        super(driver);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }


}
