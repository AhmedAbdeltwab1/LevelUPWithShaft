package TestPackage;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class  TestClass extends AbstractTestCase{
    @Epic("SHAFT Web GUI Template")
    @Story("Google Basic Validations")
    @TmsLink("TC-001")
    @Description("Given I am on the Home page,\nThen the browser title should be 'Google'.")

    @Test(description = "Check that Home Page Title is correct.")
    public void checkHomePageTitleIsCorrect() {
        new Home(driver).navigateToGoogl().verifyBrowserTitleIsCorrect();
    }

    @Epic("SHAFT Web GUI Template")
    @Story("Google Basic Validations")@TmsLink("TC-002")
    @Description("Given I am on the Home page,\nWhen I search for a valid query,\nThen the result stats will show some data (will not be empty).")

    @Test(description = "Check that Result Stats is not empty after searching for a query.")
    public void checkResultStatsIsNotEmptyAfterSearchingForAQuery() {
        new Home(driver)
                .navigateToGoogl()
                .searchForQuery(testData.getTestData("searchQueryWithShaft"))
                .assertResultStatsIsNotEmpty();
    }
    @Test(description = "Check the first link of the result page is correct.")
    public void tesFirstLink(){
        new Home(driver)
                .navigateToDuckDuckGo()
                .searchForQuery(testData.getTestData("QueryWithSelenium"))
                .testResultFirstLink(testData.getTestData("link"));
    }
    @Test(description = "Test the first checkbox of the page is checked.")
    public void testCheckBox(){
        new CheckBoxPage(driver)
                .navigate()
                .selectFirstCheckBox()
                .checkBoxStatus();
    }
    @Test(description = "CheckTheCountryOfTheNameFromRTheTable")
    public void testTheCountryOfSpecificName(){
        new TablePage(driver)
                .navigateToTablePage()
                .checkCountry();
    }
    @Test(description = "CheckUploadImage")
    public void testUploadImage(){
        new UploadImage(driver)
                .navigateToUploadImagePage()
                .chooseFileToUpload()
                .clickToUploadTheImage()
                .uploadedImageStatus();

    }
    @Test(description ="DragAndDropPerform")
    public void testDragAndDrop(){
        new DragAndDropPage(driver)
                .navigateToDragAndDropPage()
                .dragAndDropPerform();
    }

}
