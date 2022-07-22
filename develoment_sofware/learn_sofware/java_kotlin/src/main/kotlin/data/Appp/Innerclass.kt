package data.Appp

import data.Boos

fun main() {
    val boss1 = Boos("sukma")
    val employee1 = boss1.Employee("agung")
    val employee2 = boss1.Employee("agung")

    val boos2 = Boos("rizki")
    val employee3 = boos2.Employee("agung")
    val employee4 = boos2.Employee("agung")

    employee1.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()

}