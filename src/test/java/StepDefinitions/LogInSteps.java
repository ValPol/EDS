package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Шаги для логина/логоута
 */
public class LogInSteps {

    @Before
    public void BeforeAll () throws Exception {
        Common.Configuration config = new Common.Configuration();
        config.SetDrivers();
    }

    @After
    public void AfterTest(){

    }

    @Then("^I successfully log in$")
    public void ISuccessfullyLogIn(){
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    };

    @When("^I enter credentials$")
    public void iEnterCredentials() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I have opened EDS application log in page$")
    public void iHaveOpenedEDSApplicationLogInPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
