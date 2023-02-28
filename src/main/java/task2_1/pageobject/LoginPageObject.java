package task2_1.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageObject extends AbstractPageObject {

    private WebElement loginField = driver.findElement(By.xpath("//input[@type= 'text']"));
    private WebElement passwordField = driver.findElement(By.xpath("//input[@type= 'password']"));
    private WebElement submitButton = driver.findElement(By.xpath("//button[@type= 'submit']"));
    private WebElement iconLoading = driver.findElement(
            By.xpath("//button[contains(@class, 'SubmitButton')]/descendant::div[contains(@class, 'LoadingSpinner')]"));
    private WebElement textErrorMessage = driver.findElement(
            By.xpath("//div[contains(@class, 'newlogindialog_FormError')]"));

    public LoginPageObject(WebDriver driver) {
        super(driver);
    }

    public void login(String login, String password) {
        wait.until(ExpectedConditions.visibilityOf(loginField)).sendKeys(login);
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
    }

    private WebElement getIconLoading() {
        return iconLoading;
    }

    private WebElement getTextErrorMessage() {
        return wait.until(ExpectedConditions.visibilityOf(textErrorMessage));
    }
    private WebElement getSubmitButton() {return wait.until(ExpectedConditions.visibilityOf(submitButton));}

}
