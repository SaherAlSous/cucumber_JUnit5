import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import nice_bank.Account
import nice_bank.CashSlot
import nice_bank.Money
import nice_bank.Teller
import org.junit.jupiter.api.Assertions.assertEquals
import org.springframework.beans.factory.annotation.Autowired

class CashWithdrawal {

    @Autowired
    private lateinit var account: Account
    @Autowired
    private lateinit var teller: Teller
    @Autowired
    private lateinit var cashSlot: CashSlot

    @Given("my account has been credited with \${nice_bank.Money}")
    fun `I have deposited a $ in my account`(amount: Money) {
        account.credit(amount = amount)
    }

    @When("I withdraw \${nice_bank.Money}")
    fun `I request $`(amount: Money) {
        teller.withdrawFrom(account, amount, cashSlot)
    }

    @Then("\${nice_bank.Money} should be dispensed")
    fun `$ should be dispensed`(amount: Money) {
        assertEquals(amount.dollars, cashSlot.getContents().dollars, "Incorrect nice_bank.Account Dollars Balance")
        assertEquals(amount.cents, cashSlot.getContents().cents, "Incorrect nice_bank.Account Cents Balance")
    }

    @Then("the balance of my account should be \${nice_bank.Money}")
    fun `Checking the remaining Balance`(amount: Money) {
        assertEquals(account.getBalance().dollars, amount.dollars, "The left balance doesn't match the required dollars")
        assertEquals(account.getBalance().cents, amount.cents, "The left balance doesn't match the required cents")
    }

}