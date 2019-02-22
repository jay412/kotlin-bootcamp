package Basics

fun main(args: Array<String>) {
    calculate(5, 5, "add")
    calculate(4, 2, "subtract")
    calculate(7, 8, "multiply")
    calculate(42, 6, "divide")
}

fun calculate(num1: Int, num2: Int, op: String){
    when(op) {
        "add" -> println(num1 + num2)
        "subtract" -> println(num1 - num2)
        "multiply" -> println(num1 * num2)
        "divide" -> println(num1 / num2)
        else -> {
            println("Invalid operation, choices include: add, subtract, multiply, divide")
        }
    }
}

fun learn() {
    //? operator means variable can be null
    var marbles : Int? = null

    //elements can be null
    var lostOfFish: List<String?> = listOf(null, null)
    //list can be null
    var evenMoreFish: List<String>? = null
    // list and elements can be null
    var definitelyFish: List<String?>? = null

    definitelyFish = listOf(null, null)

    /* if fishFoodTreats is not null, decrease it otherwise return 0
    var fishFoodTreats: Int = 5
    return fishFoodTreats?.dec() ?: 0 */

    //chaining method calls
    var fish = 2.plus(71).plus(233).minus(13).div(30).plus(1)


    //var variables are mutable
    var rainbowColor: String = "red";
    rainbowColor = "blue";

    //val variables cannot be reassigned
    val blackColor: String = "black";
    //blackColor = "pink";

    //need to declare variable to be nullable
    //rainbowColor = null;

    var greenColor: String? = null;
    var blueColor = null;
}