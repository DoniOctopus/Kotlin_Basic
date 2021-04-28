package main.com.vicaenigma.basickotlin.day3

fun main() {
    val total = divide(10,5)
    println(total)

    greetMessage("Doni Octavian")
}

//returnnya otomatis dibaca
fun divide(number1 : Int , number2 : Int) : Int = number1 / number2

//karena Unit tidak ada return atau balikan nilai
fun greetMessage(fullname : String) : Unit = println(fullname)