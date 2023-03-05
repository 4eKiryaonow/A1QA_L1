package task3_1.element;

import org.openqa.selenium.By;
import task3_1.base.BaseElement;
import task3_1.utils.InfoLogger;

public class TextBox extends BaseElement {

    public TextBox(By locator, String elementName) {
        super(locator, elementName);
    }

    public void inputValue(String value) {
        InfoLogger.info(String.format("inputValue(\"%s\") for: %s", value, this.getElementName()));
        this.findElement().sendKeys(value);

    }
}
