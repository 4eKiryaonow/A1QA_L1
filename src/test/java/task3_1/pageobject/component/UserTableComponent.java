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
import task3_1.utils.ConditionalWait;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class UserTableComponent extends BaseForm {

    private static Label userTableLabel = new Label(
            By.cssSelector("div.rt-table"), "TableForm");
    private TextBox tableBody = new TextBox(By.cssSelector("div.rt-tbody"), "BodyTable");
    private TextBox tableRow = new TextBox(By.cssSelector("div.rt-tr"), "RowTable");
    private TextBox tableCell = new TextBox(By.cssSelector("div.rt-td"), "TableCell");
    private String dynamicLocatorUserButton = "//span[contains(@id, 'delete-record-%d')]";

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
                .filter(User -> !User.getFirstName().equals(" "))
                .collect(Collectors.toList());
    }

    public void deleteUserFromTable(User user) {

        int position = this.getUserRowNumber(user) + 1;
        this.clickDeleteButton(position);

    }

    public void clickDeleteButton(int row) {

        Button clickDeleteButton = new Button(By.xpath(String.format(dynamicLocatorUserButton, row)), "UserButton");
        clickDeleteButton.clickElement();
        ConditionalWait.waitElementDisappears(clickDeleteButton);

    }

    public int getUserRowNumber(User user) {

        return this.getListOfUsers().indexOf(user);

    }




}


