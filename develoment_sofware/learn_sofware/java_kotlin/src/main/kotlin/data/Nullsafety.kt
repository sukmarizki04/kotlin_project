package data

data class Friend(val name: String)

fun sayHello(friend: Friend?) {
//    println("Hello${friend?.name}")

  //      println("Hello ${friend?.name}  ")

  //  val name = friend?.name ?: "kawan kawan"
    //println("Hello $name")

    val NotNullFriend = friend!!

    val name = NotNullFriend.name
    println("Hello $name")

}
fun main() {
    sayHello(Friend("sukma"))
    sayHello(null) //error
}
