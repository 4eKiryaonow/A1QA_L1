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

    public String getTitleOfSearchResult(int indexResult) {

        if (!searchResultList.isEmpty()) {

            return searchResultList.get(indexResult).findElement(
                    By.cssSelector("div.search_name > span.title")).getText();

        } else return "No results";

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
                            By.cssSelector("span.search_review_summary"))
                    .getAttribute("data-tooltip-html")
                    .replace("<br>", " "));
        } catch (NoSuchElementException e) {

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
                .map(e -> e.replace("platform_img", "").trim())
                .collect(Collectors.toList());

    }

    public List<GameResult> getSearchResults() {

        return searchResultList
                .stream()
                .map(this::getGameResult)
                .collect(Collectors.toList());

    }

    public List<GameResult> getFirstAndSecondResults() {

        List<GameResult> gameResultList = new ArrayList<>();
        gameResultList.add(getGameResultByIndex(0));
        gameResultList.add(getGameResultByIndex(1));
        return gameResultList;

    }

    public GameResult getGameResultByIndex(int index) {

        return getGameResult(searchResultList.get(index));
    }

}
