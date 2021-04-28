package main.com.vicaenigma.basickotlin.day2

fun main() {
  val finalExam = "E"
//Default When
//    when (finalExam){
//        "A" -> {println("Luar Biasa")}
//        "B" -> {println("Bagus")}
//        "C" -> {println("Cukup")}
//        "D" -> {println("Kurang")}
//        else -> {println("Nilai Tidak Ditemukan")}
//    }

//alternatif when
//    when(finalExam){
//        "A" , "B" , "C" -> println("lulus")
//        else -> println("tidak lulus")
//    }

//cara lain(alternatif)
    val passvalue = arrayOf("A","B","C")
    when(finalExam){
        //in untuk mengecek value yang banyak
        in passvalue -> println("lulus")
        !in passvalue ->println("tidak lulus")
    }

//cek Type Data
    val name = "Doni"
    when(name){
        //is untuk mencek suatu type data
        is String -> println("Tipe data ini adalah string")
        !is String -> println("Tipe data ini bukan string")
    }

}