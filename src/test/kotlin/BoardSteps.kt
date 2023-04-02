import io.cucumber.datatable.DataTable
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import kotlin.test.assertEquals

class BoardSteps {

    private lateinit var board: MutableList<MutableList<String>>
    
    @Given("a board like this:")
    fun `A board like this`(dataTable: DataTable) {
        board = dataTable.asLists()
    }

    @When("player x plays in row {int}, column {int}")
    fun `Player x plays in row column`(int1: Int, int2: Int) {
        board[int1][int2] = "x"
    }

    @Then("the board should like this:")
    fun `The board should like this`(dataTable: DataTable) {
        assertEquals(dataTable.asLists(), board)
    }
    
}