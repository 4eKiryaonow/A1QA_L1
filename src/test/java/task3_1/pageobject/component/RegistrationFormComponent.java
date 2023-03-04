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

    public void inputFirstName(User user) {

        firstName.inputValue(user.getFirstName());
    }

    public void inputLastName(User user) {

        lastName.inputValue(user.getLastName());
    }

    public void inputEmail(User user) {

        email.inputValue(user.getEmail());
    }

    public void inputAge(User user) {

        age.inputValue(user.getAge());
    }

    public void inputSalary(User user) {

        salary.inputValue(user.getSalary());
    }

    public void inputDepartment(User user) {

        department.inputValue(user.getDepartment());
    }

    public void clickSubmitBtn() {

        submitBtn.clickElement();
        ConditionalWait.waitElementDisappears(regFormLabel);
    }

    public void enterUser(User user) {

        inputFirstName(user);
        inputLastName(user);
        inputEmail(user);
        inputAge(user);
        inputSalary(user);
        inputDepartment(user);
        clickSubmitBtn();

    }

}
