package main.com.vicaenigma.basickotlin.day3



fun main() {
   named()
   perhitungan()
   dataCustomer()
}

fun named(){
    println("Doni Octavian")
}

fun perhitungan(){
    val a : Int = 10
    val b : Int = 5
    val hasil = a + b
    println(hasil)
}

fun dataCustomer(){
    val customer : Array<String> = arrayOf("Doni","Edi","Caca","Dea","Shayrul")
    println(customer[0])
}