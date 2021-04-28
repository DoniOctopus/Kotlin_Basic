package main.com.vicaenigma.basickotlin.day3

fun main() {
    finalValue("Doni",23 , 24 , 25 , 26 , 27 ,28 ,29, 30)
    sum()

}

fun finalValue(nama : String , vararg umur : Int){
    println("Nama saya $nama dan umur saya a${umur.joinToString()}")
}


//pemanggilan function dari luar file yang sudah dibuat dalam satu project
fun sum(){
    perhitungan()
    perkalian(5,5)
}