package task3_1.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import task3_1.driver.WebDriverProvider;
import task3_1.utils.ConditionalWait;
import task3_1.utils.InfoLogger;
import task3_1.utils.JsUtil;

public abstract class BaseElement {

    private By locator;
    private String elementName;
    private WebDriver driver;

    public BaseElement(By locator, String elementName) {
        this.locator = locator;
        this.elementName = elementName;
        driver = WebDriverProvider.getDriver();

    }

    public String getElementName() {
        return elementName;
    }

    public WebElement findElement() {
        InfoLogger.info(String.format("findElement(\"%s\") for: %s", this.locator, this.getElementName()));
        return this.driver.findElement(locator);
    }


    public void clickElement() {
        InfoLogger.info(String.format("clickElement() for: %s", this.getElementName()));

        ConditionalWait.waitToBeClickable(locator);
        findElement().click();
    }

    public void scrollDownElement() {
        InfoLogger.info(String.format("scrollDownElement() for: %s", this.getElementName()));
        JsUtil.pageScrollDown(locator);

    }

    public boolean isElementPresented() {
        return !WebDriverProvider.getDriver().findElements(locator).isEmpty();
    }

    public boolean isElementDisplayed() {
        InfoLogger.info(String.format("isElementDisplayed() for: %s", this.getElementName()));
        return WebDriverProvider.getDriver().findElement(locator).isDisplayed();
    }

    public String getTextOfElement() {
        InfoLogger.info(String.format("getTextOfElement() for: %s", this.getElementName()));
        return this.findElement().getText();
    }

    public By getLocator() {
        return locator;
    }


}
