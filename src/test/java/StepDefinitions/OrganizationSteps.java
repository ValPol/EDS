package StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Определения шагов для действий с организацией
 */
public class OrganizationSteps {


    @Before
    public void BeforeAll () throws Exception {
        Common.Configuration config = new Common.Configuration();
        config.SetDrivers();
    }

    @After
    public void AfterTest(){

    }
}
