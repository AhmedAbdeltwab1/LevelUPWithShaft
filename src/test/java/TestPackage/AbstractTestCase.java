package TestPackage;

import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.Home;

public class AbstractTestCase {
    SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.JSON testData;
    @BeforeClass(description = "Setup Test Data.")
    public void beforeClass(){
        testData = new SHAFT.TestData.JSON("simpleJSON.json");
    }

    @BeforeMethod(description = "Setup Browser instance.")
    public void beforeMethod() {
        driver = new SHAFT.GUI.WebDriver();
    }

    @AfterMethod(description = "Teardown Browser instance.")
    public void afterMethod() {
        driver.quit();
    }

}
