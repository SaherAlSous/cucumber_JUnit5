import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import kotlin.properties.Delegates


class ScenarioOutline {

    private var myAccount by Delegates.notNull<Int>()
    private var withdrawal by Delegates.notNull<Int>()

    @Given("I have \${int} in my account")
    fun `I have $ in my account`(int1: Int) {
        myAccount = int1
    }

    @When("I choose to withdraw the fixed amount of \${int}")
    fun `I choose to withdraw the fixed amount of $`(int1: Int) {
        if (myAccount > int1) myAccount -= int1 else myAccount
        withdrawal = int1
    }

    @Then("I should receive \${int} cash")
    fun `I should receive $ cash`(int1: Int) {
        assertEquals(int1, withdrawal)
    }

    @Then("the balance of my account now should be \${int}")
    fun `The balance of my account should be $`(int1: Int) {
        assertEquals(int1, myAccount)
    }

    @Then("I should see an error message")
    fun `I should see and error message`() {
        assertTrue(true)
    }

}