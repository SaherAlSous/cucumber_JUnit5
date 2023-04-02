package async

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.properties.Delegates


@OptIn(ExperimentalCoroutinesApi::class)
class AsyncTest {
    
    private var num by Delegates.notNull<Int>()
    private var result by Delegates.notNull<Int>()
    private val repo = Repo()

    @Given("I have a specific {int}")
    fun `I have a specific`(int1: Int) = runTest {
        num = int1
    }

    @When("I add it to {int} number")
    fun `I add it to number`(int1: Int) = runTest {
        repo.calculate(num, int1).collect { calc ->
            result = calc
        }
    }

    @Then("I should get the {int}")
    fun `I should get the`(int1: Int) {
        assertEquals(int1, result, "Async didn't work...")
    }
    
}