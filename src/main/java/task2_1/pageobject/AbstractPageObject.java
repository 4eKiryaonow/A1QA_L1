package task2_1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import task2_1.pageobject.component.FooterPageComponent;
import task2_1.pageobject.component.HeaderPageComponent;
import task2_1.pageobject.component.MenuPageComponent;

import java.time.Duration;
import java.util.ArrayList;

public abstract class AbstractPageObject {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected String title;
    protected String url;
    protected HeaderPageComponent header;
    protected MenuPageComponent menu;
    protected FooterPageComponent footer;
    protected PrivacyPolicyPageObject privacyPolicyPageObject;

    protected AbstractPageObject(WebDriver driver) {
        this.driver = driver;
        this.title = this.driver.getTitle();
        this.url = this.driver.getCurrentUrl();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(this.driver, this);
        header = new HeaderPageComponent(driver);
        menu = new MenuPageComponent(driver);
        footer = new FooterPageComponent(driver);

    }

    public String getUrl() {
        return this.url;
    }

    public HeaderPageComponent header() {
        return this.header;
    }

    public MenuPageComponent menu() {
        return this.menu;
    }

    public FooterPageComponent footer() {
        return this.footer;
    }

    public PrivacyPolicyPageObject openPrivacyPolicyPage() {
        String oldTab = driver.getWindowHandle();
        this.footer.clickByLinkPrivacyPolicy();
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        return new PrivacyPolicyPageObject(driver);

    }

}