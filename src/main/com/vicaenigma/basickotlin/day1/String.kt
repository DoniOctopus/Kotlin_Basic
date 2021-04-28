package main.com.vicaenigma.basickotlin.day1

fun main() {
    var fullName : String = "Doni Octavian"
    var alamat : String = """Enigmacamp
        Ragunan
        Jakarta Selatan
    """

    var alamat2 : String = """
        > Enigmacamp
        > Ragunan
        > Jakarta Selatan
    """.trimMargin(">")

    var biodata : String = "nama saya ${fullName} \n alamat saya ada di ${alamat2}"
    println(biodata)


//    println(fullName)
//    println(alamat)
//    println(alamat2)
}