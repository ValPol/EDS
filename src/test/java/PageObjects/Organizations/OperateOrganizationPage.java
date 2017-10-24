package PageObjects.Organizations;

import PageObjects.MainLayout.MainLayoutPage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Страница действий с организацией
 */
public class OperateOrganizationPage extends MainLayoutPage {

    @FindBy( xpath ="//*[@data-bind='text: selectButtonName, click: selectCertificate']")
    public SelenideElement loadCertificate;

    @FindBy( xpath ="//*[@class='search required anim-placeholder disabled-when-certificate-not-selected disabled-when-organization-has-any-report-in-process k-input']")
    public SelenideElement okpoField;

    @FindBy( id ="bik")
    public SelenideElement bikField;

    @FindBy (id="CheckingAccount")
    public SelenideElement checkingAccountField;

    @FindBy (xpath ="//*[@class='anim-placeholder btn']")
    public SelenideElement addBankDetailsButtom;

    


    /*
    *   Виджет выбора сертификата
    * */
    @FindBy( xpath ="//*[@class='btn plain cancelModalWindow']")
    public SelenideElement cancelButtom;





}
