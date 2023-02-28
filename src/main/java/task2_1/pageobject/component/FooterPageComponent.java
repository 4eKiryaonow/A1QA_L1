package task2_1.pageobject.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import task2_1.utils.JavaScriptSupport;

public class FooterPageComponent extends AbstractBaseComponent {

    private WebElement linkPrivacyPolicy = driver.findElement(
            By.xpath("//div[@id='footer_text']//a[contains(@href, 'privacy_agreement')]"));

    public FooterPageComponent(WebDriver driver) {
        super(driver);
    }

    public void clickByLinkPrivacyPolicy() {

        JavaScriptSupport.pageScrollDown(linkPrivacyPolicy);
        wait.until(ExpectedConditions.elementToBeClickable(linkPrivacyPolicy)).click();

    }
}
