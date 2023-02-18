package task2_1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrivacyPolicyPageObject extends AbstractPageObject {

    @FindBy(css = "#languages a")
    private List<WebElement> languagesList;
    @FindBy(id = "languages")
    private WebElement flags;
    @FindBy(id = "newsColumn")
    private WebElement textColumn;

    public PrivacyPolicyPageObject(WebDriver driver) {
        super(driver);
    }
    public List<String> getLanguagesTable() {
        return new ArrayList<>();
    }
    public boolean PrivacyPolicyIsOpened() {
        return flags.isDisplayed();
    }



}
