package PageObjects.Reports;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class GridReportFNS {

        @FindBy( xpath ="//*[@class='k-grid-header']")
        public SelenideElement gridHeader;

}
