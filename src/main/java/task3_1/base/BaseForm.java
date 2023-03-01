package task3_1.base;

public abstract class BaseForm {

    private BaseElement baseElement;
    private String formName;

    public BaseForm(BaseElement baseElement, String formName) {

        this.baseElement = baseElement;
        this.formName = formName;

    }

    public boolean formIsOpened() {

        return baseElement.isElementDisplayed();

    }








}
