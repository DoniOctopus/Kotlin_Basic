package main.com.vicaenigma.basickotlin.day3

fun main() {
    myPet("Kucing")
    myPet("Kucing","Anjing")
    perkalian(5)
    perkalian(5,5)
    println(pembagian(5,5))
    pengurangan(5,3)
}

fun myPet(pet1 : String, pet2 : String = "Kelinci"){
    println("Hewan Peliharaanku ada ${"$pet1 $pet2"}")
}

fun perkalian( x : Int , y : Int = 10){
    println("hasil dari $x dan $y adalah ${x*y}")
}

//function retrun
//hasil akhirnya harus Integer
fun pembagian(a : Int , b : Int) : Int{
    val total = a / b
    return total
}

//function Unit
fun pengurangan(a : Int , b : Int) : Unit{
    val total = a - b
    println(total)
}