import java.text.DecimalFormat

fun main() {
    val tip: Double = 0.175
    val tax: Double = 0.025
    var totalCost: Double = 0.0
    var tempCost: Double = 0.0
    val twoDecimal = DecimalFormat("$#,###.00")

    do {
        println("Cost of the item")
        tempCost = readln().toDouble()
        totalCost += tempCost

    }while(tempCost != 0.0)
    var taxCost = totalCost + totalCost*tax

    println("Tax: $tax\n" +
            "Cost: ${twoDecimal.format(totalCost)}\n" +
            "Cost w/ Tax: ${twoDecimal.format(taxCost)}\n" +
            "Would you like to add a tip(Y/N)")
            var isTip = readln()
    if (isTip.equals("Y")){
        var finalCost = taxCost + totalCost*tip
        println("Final cost: ${twoDecimal.format(finalCost)}")
    }
    else{
        println("Final cost: ${twoDecimal.format((taxCost))}")
    }

}