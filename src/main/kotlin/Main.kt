import bevarages.Coffee
import bevarages.Tea


val availableBeverages = mapOf("1" to Tea(), "2" to Coffee())

fun main() {
    println("Want Beverage? Enter 1 for Tea / 2 for Coffee!")
    val input = readLine()
    if (input != null) {
        if (!availableBeverages.contains(input))
            throw UnsupportedOperationException("Beverage is not supported yet!")
        availableBeverages[input]?.getBeverage()
    }

}