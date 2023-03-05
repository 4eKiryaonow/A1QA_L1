package task3_1.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import task3_1.driver.WebDriverProvider;
import task3_1.utils.ConditionalWait;
import task3_1.utils.JsUtil;

import java.time.Duration;

public abstract class BaseElement {

    private By locator;
    private String elementName;
    private WebDriver driver;

    public BaseElement(By locator, String elementName) {
        this.locator = locator;
        this.elementName = elementName;
        driver = WebDriverProvider.getDriver();

    }

    public WebElement findElement() {

        return this.driver.findElement(locator);
    }


    public void clickElement() {

        JsUtil.pageScrollDown(locator);
        ConditionalWait.waitToBeClickable(locator);
        findElement().click();
    }

    public boolean isElementPresented() {

        return !WebDriverProvider.getDriver().findElements(locator).isEmpty();
    }

    public boolean isElementDisplayed () {

        return WebDriverProvider.getDriver().findElement(locator).isDisplayed();
    }

    public String getTextOfElement() {

        return this.findElement().getText();
    }
    public By getLocator() {
        return locator;
    }


}
