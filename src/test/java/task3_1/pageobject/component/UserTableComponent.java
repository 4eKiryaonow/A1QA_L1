package task3_1.pageobject.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.w3c.dom.Text;
import task3_1.base.BaseElement;
import task3_1.base.BaseForm;
import task3_1.element.Button;
import task3_1.element.Label;
import task3_1.element.TextBox;
import task3_1.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class UserTableComponent extends BaseForm {

    private static Label userTableLabel = new Label(
            By.cssSelector("div.rt-table"), "TableForm");
    private TextBox tableBody = new TextBox(By.cssSelector("div.rt-tbody"), "BodyTable");
    private TextBox tableRow = new TextBox(By.cssSelector("div.rt-tr"), "RowTable");
    private TextBox tableCell = new TextBox(By.cssSelector("div.rt-td"), "TableCell");
    private Button deleteUserButton = new Button(
            By.xpath("//span[contains(@id, 'delete-record')]"), "DeleteButton");

    public UserTableComponent() {

        super(userTableLabel, "UserTable");
    }

    public List<WebElement> getAllRows() {

        return new ArrayList<>(
                tableBody
                        .findElement()
                        .findElements(By.cssSelector("div.rt-tr")));

    }

    public User getUserFromRow(WebElement element) {

        return new User(
                element.findElements(tableCell.getLocator()).get(0).getText(),
                element.findElements(tableCell.getLocator()).get(1).getText(),
                element.findElements(tableCell.getLocator()).get(2).getText(),
                element.findElements(tableCell.getLocator()).get(3).getText(),
                element.findElements(tableCell.getLocator()).get(4).getText(),
                element.findElements(tableCell.getLocator()).get(5).getText()

        );
    }
    public List<User> getListOfUsers() {

        return tableBody
                .findElement()
                .findElements(tableRow.getLocator())
                .stream()
                .map(this::getUserFromRow)
                .collect(Collectors.toList());
    }

    public void getFilledRows() {

        List<WebElement> list = new ArrayList<>();
        List<WebElement> list2 = tableBody.findElement().findElements(tableRow.getLocator());

        for (int i = 0;  i < list2.size(); i++) {

            if (list2.get(i).findElement(deleteUserButton.getLocator()).isDisplayed()) {

                list.add(list2.get(i));
            }
        }
        System.out.println(list.size());


    }



}
