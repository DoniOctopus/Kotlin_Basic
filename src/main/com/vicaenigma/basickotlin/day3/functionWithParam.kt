package main.com.vicaenigma.basickotlin.day3

fun main() {
fullname("Doni","Octavian")
number(10,5)
    myName("Doni","Octavian",null)
}

fun fullname(firstName : String , lastName : String){
    println("Hallo Nama Saya ${"$firstName $lastName"}")
}

fun number(x : Int, y: Int){
    println("hasil dari $x dan $y adalah ${x+y}")
}

fun myName(firstName: String,middelName : String, lastName: String?){
    if (lastName == null){
        println("Nama Saya ${"$firstName $middelName"}")
    }else{
        println("Nama Saya ${"$firstName $middelName $lastName"}")
    }
}

