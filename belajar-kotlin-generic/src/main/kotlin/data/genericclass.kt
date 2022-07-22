package data

import app.mydata

fun main() {
    val mydataString: mydata<String,Int> = mydata<String,Int>("sukma",100)

    mydataString.printlnData()

    val mydataInt: mydata<Int,String> = mydata <Int,String>(20,"sukma")

    mydataInt.printlnData()
}