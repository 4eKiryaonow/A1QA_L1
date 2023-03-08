package task3_1.pageobject;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Label;
import task3_1.element.TextBox;

public class LinksPageObject extends BaseForm {

    private static Label linksLabel = new Label(
            By.xpath("//div[@class='main-header'][contains(text(), 'Links')]"), "Links Label");
    private TextBox linkHome = new TextBox(By.xpath("//a[@id='simpleLink']"), "Home Link");


    public LinksPageObject() {
        super(linksLabel, "Links Page");

    }

    public void clickLinkHome() {

        linkHome.clickElement();
    }

    public void scrollLinkHome() {

        linkHome.scrollDownElement();
    }

    public void scrollThenClickLinkHome() {
        scrollLinkHome();
        clickLinkHome();
    }

}
