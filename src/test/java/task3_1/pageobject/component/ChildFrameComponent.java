package task3_1.pageobject.component;

import org.openqa.selenium.By;
import task3_1.base.BaseFrame;
import task3_1.element.Label;

public class ChildFrameComponent extends BaseFrame {

   private static By childFrameLocator = By.xpath("//body[contains(text(), 'ParentFrame')]//iframe");
   private static Label childFrameLabel = new Label(By.xpath(""), "ChildParentLabel");

   public ChildFrameComponent() {
       super(childFrameLabel, childFrameLocator, "ChildFrame");
   }
   



}
