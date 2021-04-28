package main.com.vicaenigma.basickotlin.day3.extension

fun main() {
    val name : String = "caca"
    println(name.hello())
    println("Edi".hello())

    val myNumber : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    for(i in myNumber){
        if (i.genap() !=null){
            println(i)
        }
    }
}