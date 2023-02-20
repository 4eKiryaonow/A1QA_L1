package task2_1.pageobject.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import task2_1.pageobject.SearchPageObject;

public class MenuPageComponent extends AbstractBaseComponent {

    @FindBy(xpath = "//input[@id='store_nav_search_term']")
    private WebElement searchFiled;
    @FindBy(xpath = "//a[@id='store_search_link']//img")
    private WebElement searchButton;

    public MenuPageComponent(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchFiled() {
        return searchFiled;
    }

    public SearchPageObject performSearchQuery(String query) {

        wait.until(ExpectedConditions.visibilityOf(searchFiled)).clear();
        wait.until(ExpectedConditions.visibilityOf(searchFiled)).sendKeys(query);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
        return new SearchPageObject(driver);
    }

}
