package task2_1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PrivacyPolicyPageObject extends AbstractPageObject {

    @FindBy(css = "#languages a img")
    private List<WebElement> languagesList;
    @FindBy(id = "languages")
    private WebElement flags;
    @FindBy(id = "newsColumn")
    private WebElement textColumn;

    public PrivacyPolicyPageObject(WebDriver driver) {
        super(driver);
    }

    public List<String> getLanguagesTable() {
        return languagesList
                .stream()
                .map(element -> element.getAttribute("src"))
                .collect(Collectors.toList());
    }

    public List<String> getListOfLanguages() {
        List<String> list = new ArrayList<>();
        List<String> list1 = getLanguagesTable();
        Pattern pattern = Pattern.compile("(?<=\\/)([a-z]+)(?=.gif)");
        for (int i = 0; i < list1.size(); i++) {
            Matcher matcher = pattern.matcher(list1.get(i));
            while (matcher.find()) {
                list.add(matcher.group());

            }
        }
        return list;
    }

    public boolean PrivacyPolicyIsOpened() {
        return flags.isDisplayed();
    }

    public String getTextOfPrivacyPolicy() {
        return textColumn.getText();
    }


}
