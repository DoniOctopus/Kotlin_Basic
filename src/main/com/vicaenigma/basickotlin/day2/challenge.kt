package main.com.vicaenigma.basickotlin.day2

fun main() {
    //genap
    //pakai cara ini diperbolehkan tetapi bila ada kasus angka
    //atau nilainya mulai dari angkaganjil akan tercetak angka ganjilnya
    //cara penyelesaiiannya? lopping + condition
    //pakai modulus
    for (i in 1..15) {
        if (i%2==0){
            println(i)
        }
    }

    for (angka in 1..20){
        when{
            (angka % 2 == 0) -> println("$angka genap")
        }
    }

    var i = 0
    while (i < 10){
        println("Nilai i = $i")
        i++ // i = i + 1
    }

    //cetak 1 sampai 15
    //yang dimana setiap nilai kelipatan 3 print Fizz
    //setiap nilainya kelipata 5 print Buzz
    //setiap nilainya kelipatan 3 dan 5 FizzBuzz

    //Output
    //1
    //2
    //Fizz
    //4
    //Buzz
    //Fizz
    //7
    //8
    //Fizz
    //Buzz
    //11
    //Fizz
    //13
    //14
    //FizzBuzz

    for(i in 1..15){
        when{
            (i %15 == 0) -> println("FizzBuzz")
            (i %5 == 0) -> println("Buzz")
            (i %3 == 0) -> println("Fizz")
            else -> println(i)
        }
    }
}
