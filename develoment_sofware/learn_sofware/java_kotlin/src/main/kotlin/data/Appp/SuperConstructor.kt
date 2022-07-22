package data.Appp

import data.ExcecutiveCostumer
import data.PremiumCustomer

fun main() {
    val PremiumCustomer = PremiumCustomer("sukma")
    println(PremiumCustomer.name)

    val ExcecutiveCostumer = ExcecutiveCostumer("sukma", 88)
    println(ExcecutiveCostumer.name)
    println(ExcecutiveCostumer.Balance)
}