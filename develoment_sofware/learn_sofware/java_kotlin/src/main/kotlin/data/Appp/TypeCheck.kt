package data.Appp

import data.Hanphone
import data.Laptop


fun printlnObjectwidthwhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is Hanphone -> println("Laptop with name ${any.name}")
        else -> println(any)
    }

}

fun printlnString(any: Any){
    val value = any as? String
    println(value)
}

fun printlnsafe(any: Any) {
    val value : String? = any as? String
    println(value)
}

fun main() {

    printlnsafe("sukma rizki")
    printlnsafe("jaya kusumo")
    printlnsafe("2")
    printlnString("sukma")
    printlnString(1)

    printlnObjectwidthwhen(1)
    printlnObjectwidthwhen("sukma")
    printlnObjectwidthwhen(1)
    printlnObjectwidthwhen(Laptop("asus"))
    printlnObjectwidthwhen(Hanphone("Realmi"))
}
