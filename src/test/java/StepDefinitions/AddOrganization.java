package StepDefinitions;

import DTO.LogInDTO;
import DTO.OrganizationDTO;
import PageObjects.LogIn.LogInPage;

import PageObjects.MainLayout.TopMenuPage;

import PageObjects.Organizations.OperateOrganizationPage;
import PageObjects.UserPrivateArea.PrivateArea;
import cucumber.api.DataTable;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;


public class AddOrganization  {
    LogInPage page;
    TopMenuPage topMenu;//=page(TopMenuPage.class);
    PrivateArea userPage;
    OperateOrganizationPage addOrganization;
    WebDriver driver;


    @Before
    public void BeforeAll () throws Exception {
        Common.Configuration config = new Common.Configuration();
        driver = config.SetDrivers();
    }

    @Given("^I have opened EDS$")
    public void iHaveOpenedEDS() throws Throwable {
        page = open("https://eds-pro-trunk.fintender.ru/Account/SignIn?ReturnUrl=%2FReport", LogInPage.class);
    }

    @When("^I enter credential$")
    public void iEnterCredential(DataTable table) throws Throwable {
        LogInDTO dto = table.asList(LogInDTO.class).get(0);
        page.setLogin(dto);
    }

    @When("^I have choose Private area$")
    public void iHaveChoosePrivateArea() throws Throwable {
        topMenu = page(TopMenuPage.class);
        topMenu.goToPersonalArea();
    }

    @When("^I have choose Organization Tub$")
    public void iHaveChooseOrganizationTub() throws Throwable {
        userPage = page(PrivateArea.class);
        userPage.clickOrganizationTub();
        userPage.clickOrganizationAdd();
    }

    @When("^I have choose Certificate$")
    public void iHaveChooseCertificate() throws Throwable {
        addOrganization = page(OperateOrganizationPage.class);
        addOrganization.chooseCertificate(driver);
    }

    @When("^I have put all information$")
    public void iHavePutAllInformation(DataTable table) throws Throwable {
        OrganizationDTO dto = table.asList(OrganizationDTO.class).get(0);
        addOrganization.setParameters(dto);

    }


    @Then("^I successfully reach it$")
    public void iSuccessfullyReachIt() throws Throwable {

    }
}
