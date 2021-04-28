package main.com.vicaenigma.basickotlin.day2

fun main() {
//    //String
//    print("Masukkan Nama : ")
//    val nama : String = readLine().toString()
//    //Number
//    print("Masukan Umur : ")
//    val umur : Int = readLine()!!.toInt()
//
//    println("===Biodata=== ")
//    println("Nama Saya Adalah $nama")
//    println("Umur Saya $umur")
    //lanjutkan dengan -/:/*/%

    //fungsi dari tyrCatch adalah untuk menangani error
    try {
        print("masukan angka pertama : ")
        val i : Int = readLine()!!.toInt()
        print("masukan angka kedua : ")
        val j : Int = readLine()!!.toInt()

        println("hasil dari pertambahan $i dan $j adalah ${i+j}")
        println("hasil dari pertambahan $i dan $j adalah ${i-j}")
        println("hasil dari pertambahan $i dan $j adalah ${i/j}")
        println("hasil dari pertambahan $i dan $j adalah ${i*j}")
        println("hasil dari pertambahan $i dan $j adalah ${i%j}")
    }catch( e : ArithmeticException){
        println(e)
    }
}