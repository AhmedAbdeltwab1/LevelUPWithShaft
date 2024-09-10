package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class UploadImage extends Page{
    By uploadFile = By.id("file-upload");
    By uploadButton = By.id("file-submit");
    public UploadImage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    public UploadImage navigateToUploadImagePage(){
        driver.browser().navigateToURL("http://the-internet.herokuapp.com/upload");
        return this;
    }
    public UploadImage chooseFileToUpload(){
        driver.element().typeFileLocationForUpload(uploadFile,"src/main/resources/DataFiles/3.jpg");
        return this;
    }
    public UploadedImageStatus clickToUploadTheImage(){
        driver.element().click(uploadButton);
        return new UploadedImageStatus(driver);
    }


}
