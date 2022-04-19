package bevarages

abstract class Beverage {

    fun getBeverage() {
        cleanPot()
        prepareMixture()
        addIngredients()
        onBeverageReady()
    }

    protected abstract fun cleanPot()

    protected abstract fun addIngredients()

    protected abstract fun showWaitingMessage()

    protected abstract fun onBeverageReady()

    private fun prepareMixture() {
        showWaitingMessage()
        addHotWater()
        addHotMilk()
        addSugar()
    }

    private fun addHotWater() {
        println("Adding hot water")
    }

    private fun addHotMilk() {
        println("Adding hot milk")
    }

    private fun addSugar() {
        println("Adding sugar")
    }

}