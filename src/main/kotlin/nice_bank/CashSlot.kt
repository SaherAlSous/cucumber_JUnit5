package nice_bank

import org.springframework.stereotype.Component

@Component
class CashSlot {

    private var withdrawn = Money(0, 0)

    fun getContents() = withdrawn

    fun dispense(amount: Money) {
        withdrawn.dollars += amount.dollars
        withdrawn.cents += amount.cents
    }

}