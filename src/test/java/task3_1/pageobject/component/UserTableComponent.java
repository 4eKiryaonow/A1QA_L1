package task3_1.pageobject.component;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Label;

public class UserTableComponent extends BaseForm {

    private static Label userTableLabel = new Label(
      By.cssSelector("div.rt-table"), "TableForm");

    public UserTableComponent() {

        super(userTableLabel, "UserTable");
    }



}
