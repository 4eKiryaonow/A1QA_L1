package task2_1.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPageObject extends AbstractPageObject {

    @FindBy(xpath = "//div[@class ='searchbar_left']//input[@id='term']")
    private WebElement searchBox;
    @FindBy(css = "div#search_resultsRows > a")
    private List<WebElement> searchResultList;

    public SearchPageObject(WebDriver driver) {
        super(driver);
    }

    public String getSearchQuery() {

        return searchBox.getAttribute("value");
    }
    public boolean SearchPageIsOpen() {

        return searchBox.isDisplayed();
    }

    public String getFirstSearchResult() {

        if (searchResultList.size() > 0) {

            return searchResultList.get(0).findElement(
                    By.xpath("//div[contains(@class, 'search_name')]/span")).getText();

        }else return String.format("No results");


    }

}
