package task2_1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import task2.pageobject.component.HeaderPageComponent;
import task2.pageobject.component.MenuPageComponent;

import java.time.Duration;

public abstract class AbstractPageObject {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected String title;
    protected String url;
    protected HeaderPageComponent header;
    protected MenuPageComponent menu;

    protected AbstractPageObject(WebDriver driver) {
        this.driver = driver;
        this.title = this.driver.getTitle();
        this.url = this.driver.getCurrentUrl();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(this.driver, this);
        header = new HeaderPageComponent(driver);
        menu = new MenuPageComponent(driver);

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

}