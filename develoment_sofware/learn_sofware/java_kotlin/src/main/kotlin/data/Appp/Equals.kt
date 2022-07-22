package data.Appp

import data.Company

fun main() {
    val company1 = Company("sukma")
    val company2 = Company("sukma")

    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)
}