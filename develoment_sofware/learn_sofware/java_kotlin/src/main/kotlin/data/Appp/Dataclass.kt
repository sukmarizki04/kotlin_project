package data.Appp

import data.Product
import java.security.spec.NamedParameterSpec

fun main() {
    val Product = Product("Mie",2002 ,"makanan")

    val Product2 = Product.copy(name = "Super Mi")
    println(Product)
    println(Product2)
}