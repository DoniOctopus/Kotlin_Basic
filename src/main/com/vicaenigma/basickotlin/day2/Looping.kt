package main.com.vicaenigma.basickotlin.day2

fun main() {
    for (i in 1..10){
        println(i)
    }

    for (i in 100 downTo -3 step 5){
        println(i)
    }

    //data hardcode
    val names = arrayOf("Sasa","caca","yer","pratama")
    for (name in names){
        //cuma diambil indexnya
        println(names.indexOf(name))
    }

    val nameLength = names.size - 1
    for (i in 0..nameLength){
        //ambil index dan valuenya
        println("index $i : ${names[i]}")
    }

    val colors = listOf("Red","Blue","Green")
    for (i in colors.indices){
        //untuk ambil indexnya
        println(i)
    }
}