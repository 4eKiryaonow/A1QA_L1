package task3_1.pageobject.component;

import org.openqa.selenium.By;
import task3_1.base.BaseFrame;
import task3_1.element.Label;

public class ChildFrameComponent extends BaseFrame {

   private static By childFrameLocator = By.xpath("//body[contains(text(), 'Parent frame')]//iframe");
   private static Label childFrameLabel = new Label(
           By.xpath("//p[contains(text(), 'Child Iframe')]"), "ChildParentLabel");

   public ChildFrameComponent() {
       super(childFrameLabel, childFrameLocator, "ChildFrame");
   }

   public String getChildFrameText() {
       return childFrameLabel.getTextOfElement();
   }

    public void switchToChildFrame() {
        this.switchToFrame();
    }
}
