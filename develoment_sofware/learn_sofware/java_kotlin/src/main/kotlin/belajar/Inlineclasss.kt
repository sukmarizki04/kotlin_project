package belajar

import data.Token


fun main() {
    val token = Token("secret Token")
    println(token.value)
    println(token.toUpper())
}