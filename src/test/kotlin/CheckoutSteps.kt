import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions.assertEquals
import org.springframework.beans.factory.annotation.Autowired
import kotlin.properties.Delegates


class CheckoutSteps {

    private var bananaPrice by Delegates.notNull<Int>()
    private var applePrice by Delegates.notNull<Int>()
    private lateinit var checkout: Checkout


    @Given("A checkout class")
    fun `Initialize the Checkout`() {
        checkout = Checkout()
    }

    @Given("the price of a {string} is {int} cents")
    fun `the price of a banana is cents`(string: String, int1: Int) {
        bananaPrice = int1
    }

    @When("I checkout {int} {string}")
    fun `i checkout`(int1: Int, string: String) {
        checkout.add(int1, bananaPrice)
    }

    @Then("the total price should be {int} cents")
    fun `the total price should be cents`(int1: Int) {
        assertEquals(int1, checkout.total())
    }

    @Given("the price of banana is {int} cent")
    fun `The price of banana is cent`(int1: Int) {
        bananaPrice = int1
    }

    @When("I checked out {int} banana")
    fun `I check out banana`(int1: Int) {
        checkout.add(int1, bananaPrice)
    }

    @Then("total price should be {int} cents")
    fun `Total price should be cents`(int1: Int) {
        assertEquals(int1, checkout.total())
    }

    @Given("the price of an apple is {int} cent")
    fun the_price_of_an_apple_is_cent(int1: Int) {
        applePrice = int1
    }

    @When("I check out {int} banana")
    fun i_checkout_banana(int1: Int) {
        checkout.add(int1, bananaPrice)
    }

    @When("i checkout {int} apple")
    fun i_checkout_apple(int1: Int) {
        checkout.add(int1, applePrice)
    }

    @Then("my total price should be {int} cents")
    fun my_total_price_should_be_cents(int1: Int) {
        assertEquals(int1, checkout.total())
    }

    @When("I check {int} bananas")
    fun i_check_bananas(int1: Int) {
        checkout.add(int1, bananaPrice)
    }

    @When("remove {int} bananas later")
    fun remove_bananas_later(int1: Int) {
        checkout.remove(int1, bananaPrice)
    }

    @Then("I should have a total of {int} cents")
    fun i_should_have_a_total_of_cents(int1: Int) {
        assertEquals(int1, checkout.total())
    }
}