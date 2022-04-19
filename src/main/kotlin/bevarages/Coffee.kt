package bevarages

class Coffee : Beverage() {
    override fun cleanPot() {
        println("Cleaning Coffee pot...")

    }

    override fun addIngredients() {
        println("Coffee Bag added")
    }

    override fun showWaitingMessage() {
        println("Coffee is getting ready...")
    }

    override fun onBeverageReady() {
        println("Coffee is Ready! Enjoy")
    }
}