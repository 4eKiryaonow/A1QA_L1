package task2_1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageObject extends AbstractPageObject {

    @FindBy(xpath = "//div[@class ='searchbar_left']//input[@id='term']")
    private WebElement searchBox;

    public SearchPageObject(WebDriver driver) {
        super(driver);
    }

    public String getSearchQuery() {

        return searchBox.getAttribute("value");
    }
}
