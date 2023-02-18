package task2_1.pageobject.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPageComponent extends AbstractBaseComponent {

    @FindBy(xpath = "//input[@id='store_nav_search_term']")
    private WebElement searchFiled;

    public MenuPageComponent(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchFiled() {
        return this.searchFiled;
    }

}
