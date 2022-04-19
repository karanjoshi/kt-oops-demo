package bevarages

class Tea : Beverage() {
    override fun cleanPot() {
        println("Cleaning Tea pot...")
    }

    override fun addIngredients() {
        println("Tea Bag added")
    }

    override fun showWaitingMessage() {
        println("Tea is getting ready...")
    }

    override fun onBeverageReady() {
        println("Tea is Ready! Enjoy")
    }
}