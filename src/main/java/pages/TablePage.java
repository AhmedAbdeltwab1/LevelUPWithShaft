package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class TablePage extends Page {
    By Ernst = By.xpath("//table[@id='customers']//tr[td[1]='Ernst Handel']/td[3]") ;
    public TablePage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    public TablePage navigateToTablePage(){
        driver.browser().navigateToURL("https://www.w3schools.com/html/html_tables.asp");
        return this;
    }
    public void checkCountry(){
        driver.assertThat().element(Ernst).text().isEqualTo("Austria");
    }


}
