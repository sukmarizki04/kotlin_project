package data.Appp

import data.Car

fun main() {
    val Alvard = Car("Suzuki")
    Alvard.year = 2001
    val Innova = Car("ertiga","Innova")

    println(Alvard.brand)
    println(Alvard.year)
    println(Innova.brand)
    println(Innova.year)
}