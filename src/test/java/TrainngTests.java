import DTO.FilterDTO;
import PageObjects.PurchasePage;
import org.junit.Test;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class TrainngTests extends BaseTest {

    @Test
    public void SomeTest() throws InterruptedException {

        System.out.println("Start");

        PurchasePage page = new PurchasePage(getWebDriver());

        page.setGridDisplayedRecordsCount("100");

        FilterDTO dto = new FilterDTO();
        dto.startPriceFrom = "0";
        dto.publishDateFrom = "20.09.2017";
        dto.publishDateTo = "21.09.2017";
        page.setFilter(dto);
        page.findRecords();
        page.evaluateStartPriceSum();

        System.out.println("end");

    }
}



