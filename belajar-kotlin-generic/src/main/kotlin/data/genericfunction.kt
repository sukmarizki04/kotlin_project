package data

import app.Function

fun main() {
    val function = Function("sukma")

    function.sayHello("sukma")
    function.sayHello<String>("sukma")


    function.sayHello(10)
    function.sayHello<Int>(10)
}