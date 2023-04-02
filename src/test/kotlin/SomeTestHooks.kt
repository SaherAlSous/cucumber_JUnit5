import io.cucumber.java.After
import io.cucumber.java.Before
import io.cucumber.java.Scenario

class SomeTestHooks {

    @Before
    fun `Before calling Scenarios`() {
        println("*********** About to start a scenario")
    }

    @After
    fun `After calling Scenarios`(scenario: Scenario) {
        println("*********** Just finished running the scenario which has ${scenario.status}")
    }

    @Before("@Account")
    fun `Before Account`() {
        println("This hook works on account tagged scenarios/test only...")
    }

}