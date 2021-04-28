package main.com.vicaenigma.basickotlin.day2

fun main() {
    var startCalculator = true
    while (startCalculator) {

        println("\n--- Simple Calculator ---")
        println("1.\tPenjumlahan")
        println("2.\tPengurangan")
        println("3.\tPerkalian")
        println("4.\tPembagian")

        print("\nMasukkan pilihan\t: ")
        val pilihan = readLine()
        println("$pilihan")
    }
}