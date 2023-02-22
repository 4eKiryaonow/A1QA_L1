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

    By locator;
    String elementName;
    WebDriver driver;
    WebDriverWait wait;

    public BaseElement(By locator, String elementName) {
        this.locator = locator;
        this.elementName = elementName;
        driver = WebDriverProvider.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public WebElement findElement() {

        return this.driver.findElement(locator);
    }


    public void clickElement() {

        JsUtil.pageScrollDown(locator);
        ConditionalWait.waitToBeClickable(locator);
        findElement().click();
    }

    public boolean isElementDisplayed() {

        return this.findElement().isDisplayed();
    }

    public String getTextOfElement() {

        return this.findElement().getText();
    }


}
