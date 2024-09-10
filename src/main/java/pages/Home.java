package pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Home extends Page{
    private String urlOFGoogle = "https://www.google.com/";
    private String urlOFDuckDuckGo = "https://duckduckgo.com/";
    private String title = "Google";
    private By searchBox = By.name("q");

    public Home(SHAFT.GUI.WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    @Step("When I navigate to the Home page.")
    public Home navigateToGoogl(){
        driver.browser().navigateToURL(urlOFGoogle);
        return this;
    }
    @Step("When I navigate to the Home page.")
    public Home navigateToDuckDuckGo(){
        driver.browser().navigateToURL(urlOFDuckDuckGo);
        return this;
    }
    @Step("Then the browser title should be 'Google'.")
    public Home verifyBrowserTitleIsCorrect(){
        driver.assertThat().browser().title().isEqualTo(title).perform();
        return this;
    }

    @Step("And I search for '{query}'.")
    public Results searchForQuery(String query){
        driver.element().type(searchBox, query)
                .keyPress(searchBox, Keys.ENTER);
        return new Results(driver);
    }



}
