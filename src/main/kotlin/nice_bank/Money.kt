package nice_bank
class Money(var dollars: Int, var cents: Int) {

    fun addMoney(amount: Money) {
        this.dollars += amount.dollars
        this.cents += amount.cents
    }

    fun removeMoney(amount: Money) {
        this.dollars -= amount.dollars
        this.cents -= amount.cents
    }

}