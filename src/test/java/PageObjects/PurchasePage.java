package PageObjects;


import Controls.Grid;
import DTO.FilterDTO;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.math.BigDecimal;
import java.util.List;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PurchasePage {

    @FindBy(id = "BaseMainContent_MainContent_chkPurchaseType_0")
    public  SelenideElement cb223;

    @FindBy(id = "BaseMainContent_MainContent_chkPurchaseType_1")
    public  SelenideElement cbcz;

//   @FindBy(id = "BaseMainContent_MainContent_txtStartPrice_txtRangeFrom")
 //  public WebElement txfrom;

    @FindBy(id = "BaseMainContent_MainContent_btnSearch")
    public SelenideElement btEnt;

    @FindBy(id = "load_BaseMainContent_MainContent_jqgTrade")
    public SelenideElement displayState;

    @FindBy(name = "BaseMainContent_MainContent_jqgTrade")
    public SelenideElement table_element;

    @FindBy(xpath ="//*[@aria-describedby='BaseMainContent_MainContent_jqgTrade_OosNumber']")
    public List<SelenideElement> tblIEC;

    @FindBy(xpath ="//*[@aria-describedby='BaseMainContent_MainContent_jqgTrade_LotStateString']")
    public List<SelenideElement> tblStLot;

    @FindBy(xpath ="//*[@aria-describedby='BaseMainContent_MainContent_jqgTrade_StartPrice']")
    public List<SelenideElement> tblSum;


    @FindBy(xpath ="//*[@class='ui-pg-selbox']")
    public SelenideElement pgCount;

    @FindBy(xpath ="//*[@id='BaseMainContent_MainContent_jqgTrade']")
    public Grid purchasedGrid;




    public PurchasePage (WebDriver driver)
    {
      //  driver.
        open("https://223.rts-tender.ru/supplier/auction/Trade/Search.aspx", PurchasePage.class);
        // PageFactory.initElements(driver, this);
    }

    public void setFilter (FilterDTO dto){

        cb223.click();
        cbcz.click();
        $(By.name("ctl00$ctl00$BaseMainContent$MainContent$txtStartPrice$txtRangeFrom")).setValue(dto.startPriceFrom).pressEnter();
        $(By.id("BaseMainContent_MainContent_txtPublicationDate_txtDateFrom")).setValue(dto.publishDateFrom).pressEnter();
        $(By.id("BaseMainContent_MainContent_txtPublicationDate_txtDateTo")).setValue(dto.publishDateTo).pressEnter();

    }

    public void setGridDisplayedRecordsCount(String count){
        String classTxNow = "ui-pg-input";
        $(By.className("ui-pg-selbox")).selectOptionContainingText(count);
    }

    public void findRecords()  {
        btEnt.shouldBe(enabled);
        btEnt.click();
        tblIEC.get(0).shouldNot(exist);
        tblIEC.get(0).should(enabled);
    }

    public String parseMoney(String str){
        String money = str.replaceAll(" руб.", "");
               money = money.replaceAll(" ", "");
               money = money.replaceAll(",", ".");
        return money;
    }

    public void evaluateStartPriceSum() throws InterruptedException {

        String idTxAll = "sp_1_BaseMainContent_MainContent_jqgTrade_toppager";
        String classTxNow = "ui-pg-input";

        List<SelenideElement> numInEIC = tblIEC;
        List<SelenideElement> numStLot = tblStLot;
        List<SelenideElement> numSum = tblSum;

        Thread.sleep(10000);

        BigDecimal sum = new BigDecimal(0);

        do{
            Thread.sleep(10000);
            System.out.println("ALL pages"+$(By.id(idTxAll)).getText());
            System.out.println("current page"+$(By.className(classTxNow)).val());
            for (int i=0;i<numInEIC.size();i++)
            {
                String s = numInEIC.get(i).getText();

                if ((s.toCharArray().length!=1)&&(numStLot.get(i).getText().compareTo("Отменена")!=0)){
                    System.out.println(i+" line "+numInEIC.get(i).getText());
                    System.out.println(numStLot.get(i).getText());
                    String str =parseMoney(numSum.get(i).getText());
                    sum = sum.add(new BigDecimal(str));
                    System.out.println(sum);
                }
            }
            $(By.id("next_t_BaseMainContent_MainContent_jqgTrade_toppager")).click();
        }
        while (Integer.parseInt($(By.id("sp_1_BaseMainContent_MainContent_jqgTrade_toppager")).getText())>Integer.parseInt($(By.className(classTxNow)).val()));

    }


}


