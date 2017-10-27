package PageObjects.Organizations;

import PageObjects.MainLayout.MainLayoutPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @FindBy( id ="bik")
    public SelenideElement bikField;

    @FindBy (id="CheckingAccount")
    public SelenideElement checkingAccountField;

    @FindBy (xpath ="//*[@class='anim-placeholder btn']")
    public SelenideElement addBankDetailsButtom;

    @FindBy (id = "addFtExchangeChbx")
    public SelenideElement exchangeDocumentMainChB;

    @FindBy ( xpath ="//*[@class='anim-placeholder required disabled-when-organization-has-any-report-in-process error']")
    public SelenideElement fnsCodeExchangeDocText;

    @FindBy (id = "ftExchangePikChbx")
    public SelenideElement getExchangeDocumentPIKChB;

    @FindBy (id = "fnsChbx")
    public SelenideElement fnsChBx;

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
        Actions builder = new Actions(driver);
        builder.sendKeys(Keys.RIGHT).perform();
        builder.sendKeys(Keys.ENTER).perform();
    }


}
