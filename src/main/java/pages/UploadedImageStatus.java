package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class UploadedImageStatus extends Page {
    By uploadedFiles = By.id("uploaded-files");

    public UploadedImageStatus(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    public void uploadedImageStatus(){
        driver.assertThat().element(uploadedFiles).text().isEqualTo("3.jpg");
    }

}
