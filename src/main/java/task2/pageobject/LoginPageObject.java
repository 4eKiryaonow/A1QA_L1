package task2.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageObject extends AbstractPageObject {

    @FindBy(xpath = "//input[@type= 'text']")
    private WebElement loginField;
    @FindBy(xpath = "//input[@type= 'password']")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@type= 'submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//button[contains(@class, 'SubmitButton')]/descendant::div[contains(@class, 'LoadingSpinner')]")
    private WebElement iconLoading;
    @FindBy(xpath = "//div[contains(@class, 'newlogindialog_FormError')]")
    private WebElement textErrorMessage;

    public LoginPageObject(WebDriver driver) {
        super(driver);
    }

    public void login(String login, String password) {
        wait.until(ExpectedConditions.visibilityOf(loginField)).sendKeys(login);
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
    }

    public WebElement getIconLoading() {
        return iconLoading;
    }

    public WebElement getTextErrorMessage() {
        return wait.until(ExpectedConditions.visibilityOf(textErrorMessage));
    }

}
