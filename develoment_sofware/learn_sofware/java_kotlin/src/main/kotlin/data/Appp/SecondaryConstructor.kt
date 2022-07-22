package data.Appp

import data.Adress

fun main() {
    val address1 = Adress("jalan B","yogyakarta")
    val address2 = Adress("jalan A","BANDUNG","INDONESIA")

    println(address1.Street)
    println(address2.Street)


}