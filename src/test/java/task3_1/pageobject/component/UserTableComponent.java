package task3_1.pageobject.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import task3_1.base.BaseForm;
import task3_1.element.Button;
import task3_1.element.Label;
import task3_1.element.TextBox;
import task3_1.models.User;
import task3_1.utils.ConditionalWait;

import java.util.List;
import java.util.stream.Collectors;


public class UserTableComponent extends BaseForm {

    private static Label userTableLabel = new Label(
            By.cssSelector("div.rt-table"), "TableForm");
    private TextBox tableBody = new TextBox(By.cssSelector("div.rt-tbody"), "BodyTable");
    private TextBox tableRow = new TextBox(By.cssSelector("div.rt-tr"), "RowTable");
    private TextBox tableCell = new TextBox(By.cssSelector("div.rt-td"), "TableCell");
    private String dynamicLocatorUserButton = "//span[contains(@id, 'delete-record-%d')]";
    private static final int INDEX_FIRST_NAME = 0;
    private static final int INDEX_SECOND_NAME = 1;
    private static final int INDEX_EMAIL = 2;
    private static final int INDEX_AGE = 3;
    private static final int INDEX_SALARY = 4;
    private static final int INDEX_DEPARTMENT = 5;



    public UserTableComponent() {
        super(userTableLabel, "UserTable");
    }

    public User getUserFromRow(WebElement element) {

        return new User(
                element.findElements(tableCell.getLocator()).get(INDEX_FIRST_NAME).getText(),
                element.findElements(tableCell.getLocator()).get(INDEX_SECOND_NAME).getText(),
                element.findElements(tableCell.getLocator()).get(INDEX_EMAIL).getText(),
                element.findElements(tableCell.getLocator()).get(INDEX_AGE).getText(),
                element.findElements(tableCell.getLocator()).get(INDEX_SALARY).getText(),
                element.findElements(tableCell.getLocator()).get(INDEX_DEPARTMENT).getText()
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

    public int getNumberOfUsers() {

        return this.getListOfUsers().size();
    }

    public void deleteUserFromTable(User user) {

        int position = this.getUserRowNumber(user) + 1;
        this.scrollDeleteBtn(position);
        this.clickDeleteBtn(position);
        ConditionalWait.waitElementDisappears(getDeleteBtn(position));
    }

    public void clickDeleteBtn(int row) {
        Button deleteBtn = this.getDeleteBtn(row);
        deleteBtn.clickElement();
    }

    public void scrollDeleteBtn(int row) {
        Button deleteBtn = this.getDeleteBtn(row);
        deleteBtn.scrollDownElement();
    }

    public Button getDeleteBtn(int row) {

        return new Button(By.xpath(String.format(dynamicLocatorUserButton, row)), "UserButton");
    }

    public int getUserRowNumber(User user) {

        return this.getListOfUsers().indexOf(user);
    }
}


