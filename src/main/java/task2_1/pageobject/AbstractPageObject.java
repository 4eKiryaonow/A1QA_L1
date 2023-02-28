package task2_1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import task2_1.pageobject.component.FooterPageComponent;
import task2_1.pageobject.component.HeaderPageComponent;
import task2_1.pageobject.component.MenuPageComponent;
import task2_1.utils.BrowserUtils;

import java.time.Duration;
import java.util.ArrayList;

public abstract class AbstractPageObject {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected HeaderPageComponent header;
    protected MenuPageComponent menu;
    protected FooterPageComponent footer;

    protected AbstractPageObject(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public HeaderPageComponent header() {

        return header = new HeaderPageComponent(driver);
    }

    public MenuPageComponent menu() {
        return menu = new MenuPageComponent(driver);
    }

    public FooterPageComponent footer() {
        return footer = new FooterPageComponent(driver);
    }

    public void openPrivacyPolicyPage() {
        this.footer().clickByLinkPrivacyPolicy();
        BrowserUtils.switchToNewTab();

    }

}