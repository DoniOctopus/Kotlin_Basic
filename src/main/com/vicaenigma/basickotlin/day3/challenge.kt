package main.com.vicaenigma.basickotlin.day3

fun main() {

    val foods : Array<String> = arrayOf("Nasi Uduk", "Nasi Goreng", "Ayam Geprek", "Pecel Ayam")
    val price : Array<Int> = arrayOf(10000,15000,25000,10000)
    val qty = arrayOfNulls<Int>(4)
    /**
     * Cetak menu tampilan awal
     */
    println("\n ===Warteg ABCD===")

    var tambahMenu = true

    while(tambahMenu){
        println("Menu : ")
        println("1. Nasi Uduk           : Rp.10000")
        println("2. Nasi Goreng         : Rp.15000")
        println("3. Nasi Geprek         : Rp.20000")
        println("4. Nasi Pecel          : Rp.10000")

        println("\nPilih Menu : ")
        val inputMenu = readLine()!!.toInt()
        println("Jumlah(QTY)   : " )
        val inputQty = readLine()!!.toInt()

        val choseMenu = inputMenu -1
        if(choseMenu in 0..3){
            qty[choseMenu] = inputQty
//            if(qty[choseMenu] != null){
//                qty[choseMenu] = qty[choseMenu]?.plus(inputQty)
//            }else{
//                qty[choseMenu] = inputQty
//            }
        }
        println("Apakah anda ingin menambah menu pesanana? : ")
        val pilihMenuLagi = readLine()!!
        if (pilihMenuLagi.toUpperCase() == "Y"){
            tambahMenu
        }else if (pilihMenuLagi.toUpperCase() == "N"){
            tambahMenu = false
        }else{
            println("Pilihan anda Tidak Valid")
            println("Silahkan Pilih Ulang  : ")
            tambahMenu
        }

    }


    /***
     * Daftar Pesanan
     */
    var totalPesanan = 0
    for (number in 0..qty.size-1){
        if (qty[number] == null){
            continue
        }else{
            println("${number+1}, ${foods[number]} : ${qty[number]}")
            totalPesanan += price[number] * qty[number]!!
        }
    }

    /***
     * penyimpanan total
     */

    print("Total    : Rp.${totalPesanan}")
}