package data

class Covariant<out T>(val  data:T) {
    fun data(): T {
        return data
    }
  /* fun setData(param: T){
        data = param
    }*/

}

fun main() {
    val covariantString = Covariant<String>("sukma")
    val covariantAny: Covariant<Any> = covariantString


    println(covariantAny.data())
  // covariantAny.setData(200)
}