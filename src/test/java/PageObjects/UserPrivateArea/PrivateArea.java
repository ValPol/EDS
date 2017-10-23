package PageObjects.UserPrivateArea;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class PrivateArea {

    @FindBy( xpath ="//*[@class='edo edo-user-organizations']")
    public SelenideElement organizationTub;


    public void clickOrganizationTub() throws InterruptedException {
        organizationTub.click();
        Thread.sleep(1000);
    }
}
