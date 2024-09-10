package pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Results extends Page{
    private By resultStats = By.id("result-stats");
    private By resultLink;
    public Results(SHAFT.GUI.WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    @Step("Then the result stats will show some data (will not be empty).")
    public Results assertResultStatsIsNotEmpty(){
        driver.assertThat().element(resultStats).text().doesNotEqual("")
                .withCustomReportMessage("Check that result stats is not empty").perform();
        return this;
    }
    @Step("I want the first link when I search for Selenium Webdriver")
    public void testResultFirstLink ( String ExpectedLink){
        resultLink = By.xpath("(//article)[1]//h2//a");
        String actualLink = driver.element().getAttribute(resultLink,"href");
        Assert.assertEquals(actualLink,ExpectedLink);
    }
}
