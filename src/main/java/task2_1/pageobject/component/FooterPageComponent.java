package task2_1.pageobject.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import task2_1.pageobject.PrivacyPolicyPageObject;
import task2_1.utils.JavaScriptSupport;

public class FooterPageComponent extends AbstractBaseComponent {

    @FindBy(xpath = "//div[@id='footer_text']//a[contains(@href, 'privacy_agreement')]")
    private WebElement linkPrivacyPolicy;

    public FooterPageComponent(WebDriver driver) {
        super(driver);
    }

    public void clickByLinkPrivacyPolicy() {

        JavaScriptSupport.pageScrollDown(linkPrivacyPolicy);
        wait.until(ExpectedConditions.elementToBeClickable(linkPrivacyPolicy)).click();

    }
}
