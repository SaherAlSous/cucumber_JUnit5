import io.cucumber.java.ParameterType
import nice_bank.Money

@ParameterType(name = "nice_bank.Money", value = ".*")
fun `Convert String to Money`(money: String): Money {
    val str = money.split('.').map { it.toInt() }
    return Money(dollars = str.first(), cents = str.last())
}