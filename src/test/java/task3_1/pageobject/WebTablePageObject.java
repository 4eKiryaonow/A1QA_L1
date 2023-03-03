package task3_1.pageobject;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Button;
import task3_1.element.Label;

import java.sql.BatchUpdateException;

public class WebTablePageObject extends BaseForm {

    private static Label webTableLabel = new Label(
            By.xpath("//div[@class = 'main-header'][contains(text(), 'Web Tables')]"), "WebTableLabel");
    private Button addBtn = new Button(By.id("addNewRecordButton"), "AddButton");

    public WebTablePageObject() {

        super(webTableLabel, "WebTablePage");
    }

    public void clickAddBtn() {

        this.addBtn.clickElement();
    }
}
