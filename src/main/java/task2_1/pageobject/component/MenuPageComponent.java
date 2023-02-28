package task2_1.pageobject.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import task2_1.pageobject.SearchPageObject;

public class MenuPageComponent extends AbstractBaseComponent {
    private WebElement searchFiled = driver.findElement(By.xpath("//input[@id='store_nav_search_term']"));
    private WebElement searchButton = driver.findElement(By.xpath("//a[@id='store_search_link']//img"));

    public MenuPageComponent(WebDriver driver) {
        super(driver);
    }

    private WebElement getSearchFiled() {
        return searchFiled;
    }

    public void performSearchQuery(String query) {

        wait.until(ExpectedConditions.visibilityOf(searchFiled)).clear();
        wait.until(ExpectedConditions.visibilityOf(searchFiled)).sendKeys(query);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
    }

}
