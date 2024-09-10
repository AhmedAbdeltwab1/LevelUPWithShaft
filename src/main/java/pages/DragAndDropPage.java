package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class DragAndDropPage extends Page{
    By dragObject =By.id("draggable");
    By dropPlace = By.id("droppable");

    public DragAndDropPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }

    public DragAndDropPage navigateToDragAndDropPage(){
        driver.browser().navigateToURL("https://jqueryui.com/resources/demos/droppable/default.html");
        return this;
    }
    public void dragAndDropPerform(){
        driver.element().dragAndDrop(dragObject,dropPlace);
        driver.assertThat().element(dropPlace).text().isEqualTo("Dropped!");
    }


}
