package main.com.vicaenigma.basickotlin.day3.extension

//extencion function adalah kemampuan function pada tipe data yang sudah ada
//extencion function ini menggunakan kata kunci this
//kegunaan dari fun extencion ini biasanya dilakukan ke typedata yang bukan punya kita

fun String.hello() : String{
    return "Hello $this"
}

fun Int.genap() : Int? {
    if (this % 2 == 0){
        return this
    }else{
        return null
    }
}