package task2_1.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import task2_1.entity.GamePlatform;
import task2_1.entity.GameResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

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

    public String getSearchResult(int indexResult) {

        if (searchResultList.size() > 0) {

            return searchResultList.get(indexResult).findElement(
                    By.xpath("//div[contains(@class, 'search_name')]/span")).getText();

        }else return String.format("No results");

    }

    public GameResult getGameResult(WebElement element) {

        GameResult gameResult = new GameResult();
        gameResult.setName(element.findElement(
                By.cssSelector("div.search_name > span.title")).getText());
        gameResult.setReleaseDate(element.findElement(By.cssSelector("div.search_released")).getText());
        gameResult.setGamePlatforms(
                getListOfGamePlatforms(element)
                        .stream()
                        .map(text -> GamePlatform.valueOf(text.toUpperCase(Locale.ROOT)))
                        .collect(Collectors.toList()));
        try {
            gameResult.setReviewSummaryResult(element.findElement(
                    By.cssSelector("span.search_review_summary")).getAttribute("data-tooltip-html"));
        }catch (NoSuchElementException e) {

            gameResult.setReviewSummaryResult(null);
        }
        gameResult.setPrice(element.findElement(
                By.cssSelector("div.search_price")).getText());

        return gameResult;

    }

    public List<String> getListOfGamePlatforms(WebElement element) {

        return element
                .findElements(By.cssSelector("span.platform_img"))
                .stream()
                .map(e -> e.getAttribute("class"))
                .map(e -> e.replace("platform_img ", ""))
                .collect(Collectors.toList());

    }

    public void printSearchResults() {

        for (int i=0; i < searchResultList.size(); i++) {

            System.out.println(getGameResult(searchResultList.get(i)));
        }

    }

}
