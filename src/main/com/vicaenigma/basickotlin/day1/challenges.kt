package main.com.vicaenigma.basickotlin.day1

fun main() {
    //body
    val number = intArrayOf(1,3,4,6,9,3,7,9,2,8,3,6,21,45,76,3,8,98,12,76,98,23,70,90,99,55)
    val tambah = number[4] + number[5]
    println("Hasil Dari Pertambahan index ke 4 dan ke 5 adalah ${tambah}")
    println(number.size)

    number.sort()
    println("kecil : ${number.joinToString()}")
    number.sortDescending()
    println("besar : ${number.joinToString()}")


    val maximal = number.max()
    val minimal = number.min()
    println("hasil dari nilai max dan min pada number adalah ${maximal} ${minimal}")
}