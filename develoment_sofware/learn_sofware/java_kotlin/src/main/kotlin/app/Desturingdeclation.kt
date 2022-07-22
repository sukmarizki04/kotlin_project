package app

import data.Appp.Game
import data.Appp.MinMax
import data2.Login

fun minmax(value1:Int, Value2:Int): MinMax {
    var value2 = 0
    return when {
        value1 > value2 ->MinMax(value2,value2)
        else -> MinMax(value1,value2)
    }

}
fun login(login:Login, callback:(Login ) -> Boolean): Boolean {
    return callback(login)
}



fun main() {
    val game = Game("Gme kotlin", 3032)
//    val name = game.name
   /// val price = game.price
    val (name,price) = game
    println(name)
    println(price)
    val login = Login("eko","rahasia")
}