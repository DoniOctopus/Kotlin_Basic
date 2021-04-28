package main.com.vicaenigma.basickotlin.day3.extension

fun main() {
    val myNumber : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    for (i in myNumber){
        if (i.genap() != null){
            println(i)
        }
    }
}