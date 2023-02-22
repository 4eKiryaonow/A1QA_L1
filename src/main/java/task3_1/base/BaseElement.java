package task3_1.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import task3_1.driver.WebDriverProvider;

public abstract class BaseElement {

    By locator;
    String elementName;
    WebDriver driver;
    WebDriverWait wait;

    public BaseElement(By locator, String elementName) {
        this.locator = locator;
        this.elementName = elementName;
        driver = WebDriverProvider.getDriver();

    }

    public WebElement findElement() {
        return this.driver.findElement(locator);
    }


    public void clickElement() {

        wait.until(ExpectedConditions.elementToBeClickable(this.findElement())).click();
    }

    public boolean isElementDisplayed() {

        return this.findElement().isDisplayed();
    }

    public String getTextOfElement() {

        return this.findElement().getText();
    }


}
