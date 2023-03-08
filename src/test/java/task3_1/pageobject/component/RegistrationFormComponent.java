package task3_1.pageobject.component;

import org.openqa.selenium.By;
import task3_1.base.BaseForm;
import task3_1.element.Button;
import task3_1.element.Label;
import task3_1.element.TextBox;
import task3_1.models.User;
import task3_1.utils.ConditionalWait;

public class RegistrationFormComponent extends BaseForm {

    private static Label regFormLabel = new Label(
            By.xpath("//div[contains(@class, 'modal-dialog')]"), "LabelRegistrationForm");
    private TextBox firstName = new TextBox(
            By.id("firstName"), "FirstNameTextBox");
    private TextBox lastName = new TextBox(
            By.id("lastName"), "LastNameTextBox");
    private TextBox email = new TextBox(By.id("userEmail"), "EmailTextBox");
    private TextBox age = new TextBox(By.id("age"), "AgeTextBox");
    private TextBox salary = new TextBox(By.id("salary"), "SalaryTextBox");
    private TextBox department = new TextBox(By.id("department"), "DepartmentTextBox");
    private Button submitBtn = new Button(By.id("submit"), "SubmitButton");

    public RegistrationFormComponent() {

        super(regFormLabel, "RegistrationForm");
    }

    public void inputFirstName(String text) {

        firstName.inputValue(text);
    }

    public void inputLastName(String text) {

        lastName.inputValue(text);
    }

    public void inputEmail(String text) {

        email.inputValue(text);
    }

    public void inputAge(String text) {

        age.inputValue(text);
    }

    public void inputSalary(String text) {

        salary.inputValue(text);
    }

    public void inputDepartment(String text) {

        department.inputValue(text);
    }

    public void clickSubmitBtn() {

        submitBtn.clickElement();
    }

    public void scrollSubmitBtn() {

        submitBtn.scrollDownElement();
    }

    public void scrollThenClickBtn() {

        scrollSubmitBtn();
        clickSubmitBtn();
    }

    public void waitRegFormDisappears() {

        ConditionalWait.waitElementDisappears(regFormLabel);
    }

    public void enterUser(User user) {

        inputFirstName(user.getFirstName());
        inputLastName(user.getLastName());
        inputEmail(user.getEmail());
        inputAge(user.getAge());
        inputSalary(user.getSalary());
        inputDepartment(user.getDepartment());
        scrollThenClickBtn();
        waitRegFormDisappears();

    }

}
