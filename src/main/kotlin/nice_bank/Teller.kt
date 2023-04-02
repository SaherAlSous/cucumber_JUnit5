package nice_bank

import org.springframework.stereotype.Component

@Component
class Teller {
    fun withdrawFrom(account: Account, amount: Money, cashSlot: CashSlot) {
        account.withdraw(amount)
        cashSlot.dispense(amount)
    }
}