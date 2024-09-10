package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckBoxPage extends Page{
    public CheckBoxPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    By checkbox = By.xpath("//form[@id='checkboxes']/input[1]");
    public CheckBoxPage navigate(){
        driver.browser().navigateToURL("http://the-internet.herokuapp.com/checkboxes");
        return this;
    }
    public CheckBoxPage selectFirstCheckBox(){
        driver.element().click(checkbox);
        return this;
    }
    public void checkBoxStatus(){
        driver.assertThat().element(checkbox).isSelected().perform();
    }


}
