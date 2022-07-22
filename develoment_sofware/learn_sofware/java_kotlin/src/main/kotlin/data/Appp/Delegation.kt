package data.Appp

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("sukma")

    val baseDelegate =MyBaseDelegate(base)
    baseDelegate.sayHello("sukma rizki")




}