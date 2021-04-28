package main.com.vicaenigma.basickotlin.day2

fun main() {
    val jam : Double = 11.25

    if (jam <= 10 ){
        println("pagi")
    }else if(jam <= 15){
        println("siang")
    }else if(jam <= 18){
        println("sore")
    }else{
        println("malam")
    }

//    val nilai : Int = 60
//
//    // == (mencocokan valuenya)
//    // ===(mencocokan object dan valuenya)
//
//    if (nilai > 90){
//        println("A")
//    }else if (nilai > 80){
//        println("B")
//    }else if (nilai >= 60) {
//        println("C")
//    }else{
//        println("D")
//    }
}