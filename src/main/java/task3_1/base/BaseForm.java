package task3_1.base;

import task3_1.utils.InfoLogger;

public abstract class BaseForm {

    private BaseElement baseElement;
    private String formName;

    public BaseForm(BaseElement baseElement, String formName) {

        this.baseElement = baseElement;
        this.formName = formName;

    }

    public boolean formIsOpened() {
        InfoLogger.info(String.format("formIsOpened() for: %s", this.getFormName()));
        return baseElement.isElementPresented();

    }

    public String getFormName() {

        return formName;
    }


}
