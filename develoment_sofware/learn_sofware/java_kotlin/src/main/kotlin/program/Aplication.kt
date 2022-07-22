package program

import annotations.Fancy


@Fancy(author = "sukma")
class Aplication(val name:String, val version:Int) {

    fun info(): String = "Aplication $name-$version"
}