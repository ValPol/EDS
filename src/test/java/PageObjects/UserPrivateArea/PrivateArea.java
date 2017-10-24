package PageObjects.UserPrivateArea;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class PrivateArea {

    @FindBy( xpath ="//*[@class='edo edo-user-organizations']")
    public SelenideElement organizationTub;

    @FindBy ( xpath ="//*[@class='btn mr0']")
    public SelenideElement addOrganizationButtom;




    public void clickOrganizationTub() throws InterruptedException {
        organizationTub.click();
        Thread.sleep(1000);
    }

    public void clickOrganizationAdd() throws InterruptedException {
        addOrganizationButtom.click();
        Thread.sleep(1000);
    }
}
