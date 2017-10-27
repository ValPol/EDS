package PageObjects.MainLayout;

import PageObjects.Reports.GridReportFNS;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

/*
* Верхнее меню
* */
public class TopMenuPage {

    @FindBy( xpath ="//*[@class='edo edo-menu-dots']")
    public SelenideElement userAccountBtm;

    @FindBy( xpath ="//*[@class='username']")
    public SelenideElement userName;

    GridReportFNS grid;
    public void goToPersonalArea() throws InterruptedException {

        //grid.gridHeader.shouldBe(visible);
        Thread.sleep(1000);
        userAccountBtm.click();
        userName.click();


    }

    }



