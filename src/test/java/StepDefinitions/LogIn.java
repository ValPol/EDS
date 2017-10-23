package StepDefinitions;

import DTO.LogInDTO;
import PageObjects.LogIn.LogInPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class LogIn {

    LogInPage page;

    @Before
    public void BeforeAll () throws Exception {
        Common.Configuration config = new Common.Configuration();
        config.SetDrivers();
    }
    
    @Given("^I have opened EDS application log in page$")
    public void iHaveOpenedEDSApplicationLogInPage() throws Throwable {
        page = open("https://eds-pro-trunk.fintender.ru/Account/SignIn?ReturnUrl=%2FReport", LogInPage.class);
    }

    @When("^I enter credentials$")
    public void iEnterCredentials(DataTable table) throws Throwable {
        LogInDTO dto = table.asList(LogInDTO.class).get(0);
        page.setLogin(dto);
    }

    @Then("^I successfully log in$")
    public void iSuccessfullyLogIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
