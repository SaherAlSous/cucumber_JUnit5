import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.properties.Delegates

class Amounts(
    private val checkout: Checkout
    ) {

    private var bananaPrice by Delegates.notNull<Int>()
    private var checkingAccount by Delegates.notNull<Int>()
    private var savingAccount by Delegates.notNull<Int>()

    @Given("Banana price is {int} cent")
    fun `Banana price is cent`(int1: Int) {
        bananaPrice = int1
    }

    @When("I checkout {int} bananas")
    fun `I checkout bananas`(int1: Int) {
        checkout.add(int1, bananaPrice)
    }

    @Then("The total cost is {int} cents")
    fun `The total cost is cents`(int1: Int) {
        assertEquals(int1, checkout.total())
    }

    @Then("Once I reset the account, it should be {int} cents")
    fun `Account Reset`(amount: Int) {
        checkout.reset()
        assertEquals(amount, checkout.total())
    }

    @Given("I have deposited \${int} in my {string}")
    fun `I have deposited $ in my`(int1: Int, string: String) {
        if (string == "Checking Account") checkingAccount = int1
        else savingAccount = int1
    }

    @When("I Transfer \${int} from my {string} to my {string}")
    fun `I transfer $ from my to my`(int1: Int, string: String, string2: String) {
        savingAccount -= int1
        checkingAccount += int1
    }

    @Then("The balance of my {string} should be \${int}")
    fun `The balance of my should be $`(string: String, int1: Int) {
        if (string == "Checking Account") assertEquals(int1, checkingAccount)
        else assertEquals(int1, savingAccount)
    }

}