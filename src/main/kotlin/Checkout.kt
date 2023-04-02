

class Checkout {

    private var totalPrice = 0

    fun add(count: Int, price: Int) {
        totalPrice += (count * price)
    }

    fun remove(count: Int, price: Int) {
        totalPrice -= (count * price)
    }

    fun total() = totalPrice

    fun reset() {
        totalPrice = 0
    }
}