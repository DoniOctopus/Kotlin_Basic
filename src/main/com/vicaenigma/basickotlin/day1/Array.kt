package main.com.vicaenigma.basickotlin.day1

fun main() {
    val members : Array<String> = arrayOf("Agil", "Aldo", "Caca")
    val balances : Array<Int> = arrayOf(2,3,4,5,6,7)
    val biodata : Array<Any> = arrayOf("Doni", "Edi" , "Edo" , "Pratama")
    val bilanganGenap = Array(5,{it * 3})
    //nama variable[index ke-berapa]
//    println(members[2])
//    println(members.joinToString())
//    println(balances.joinToString())
//    println(biodata.joinToString())
    println(bilanganGenap.joinToString())

}