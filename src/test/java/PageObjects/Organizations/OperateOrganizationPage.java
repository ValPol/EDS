package PageObjects.Organizations;

import DTO.OrganizationDTO;
import PageObjects.MainLayout.MainLayoutPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.FindBy;


import static com.codeborne.selenide.Selenide.$;

/**
 * Страница действий с организацией
 */
public class OperateOrganizationPage extends MainLayoutPage {

    /*
    * Страница редактирования/добавления организации
    * */

    @FindBy( xpath ="//*[@data-bind='text: selectButtonName, click: selectCertificate']")
    public SelenideElement loadCertificate;

    @FindBy( xpath ="//*[@class='search required anim-placeholder disabled-when-certificate-not-selected disabled-when-organization-has-any-report-in-process k-input']")
    public SelenideElement okpoField;

    @FindBy ( xpath ="//*[@class='k-virtual-item k-item']")
    public SelenideElement okpoVar;

    @FindBy( id ="bik")
    public SelenideElement bikField;

    @FindBy (id="CheckingAccount")
    public SelenideElement checkingAccountField;

    @FindBy (xpath ="//*[@class='anim-placeholder btn']")
    public SelenideElement addBankDetailsBtm;

    @FindBy (xpath ="//*[@for='addFtExchangeChbx']")
    public SelenideElement exchangeDocumentMainChB;

    @FindBy ( xpath ="//*[@class='anim-placeholder required disabled-when-organization-has-any-report-in-process error']")
    public SelenideElement fnsCodeExchangeDocText;

    @FindBy (id = "ftExchangePikChbx")
    public SelenideElement getExchangeDocumentPIKChB;

    @FindBy (id = "fnsChbx")
    public SelenideElement fnsChBx;

    @FindBy (xpath ="//*[@data-bind='click: submitData, enable: isModelDirty']")
    public SelenideElement enterBTM;

    //@FindBy ( xpath ="//*[@class='anim-placeholder required disabled-when-organization-has-any-report-in-process']")


    /*
    *   Виджет выбора сертификата
    * */
    @FindBy( xpath ="//*[@class='btn plain cancelModalWindow']")
    public SelenideElement cancelButtom;

    @FindBy (id = "selectSignin")
    public SelenideElement chooseCertificate;


    public void chooseCertificate(WebDriver driver) throws InterruptedException {
        //Configuration config = new Configuration();
        loadCertificate.click();
        Thread.sleep(1000);
       $(By.xpath("//*[text()='Филатов Сергей Вадимович']")).click();
       chooseCertificate.click();
       Thread.sleep(1000);
    }


    public void setParameters(OrganizationDTO dto) throws InterruptedException {
        okpoField.setValue(dto.okpo);
        Thread.sleep(1000);
        $(By.xpath("//*[text()='12300 Общества с ограниченной ответственностью']")).click();
        // okpoVar.click();
        bikField.setValue(dto.bik);
        checkingAccountField.setValue(dto.checkingAccount);
        Thread.sleep(2000);
        addBankDetailsBtm.click();
        exchangeDocumentMainChB.click();
        Thread.sleep(1000);
        enterBTM.click();
       // enterBTM.click();
       // Thread.sleep(1000);
      //  fnsCodeExchangeDocText.setValue(dto.fnsCodeExchangeDocText);
    }

    public boolean notificationAppeared () {

      return  $(By.xpath("//*[text()='Запрос на добавление организации успешно сформирован')")).isDisplayed();

    }

}
