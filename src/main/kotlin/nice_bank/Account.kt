package nice_bank

import org.springframework.stereotype.Component

@Component
class Account() {

    private var accountBalance = Money(0, 0)

    fun credit(amount: Money) {
        accountBalance.addMoney(amount)
    }

    fun withdraw(amount: Money) {
        accountBalance.removeMoney(amount)
    }

    fun getBalance() = accountBalance
}