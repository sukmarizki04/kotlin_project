package data.Appp

import data.Company

fun main() {
    val company1 = Company("sukma")
    val company2 = Company("sukma")


    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
}