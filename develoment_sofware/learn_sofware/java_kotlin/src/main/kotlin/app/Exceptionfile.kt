package app

import Exception.ValidationException

fun validateAndSayHello(name:String) {

    if (name.isBlank()) {
        throw ValidationException("name is blank")
    } else {
        println("Hello $name")
    }

}
fun main() {
    try {
        validateAndSayHello("sukma")
        validateAndSayHello("")
        println("program")
    } catch (e : ValidationException) {
        println("Terjadi Error ${e.message}")
    } catch (error : Throwable) {
        println("Terjadi Error ${error.message}")
    } finally {
       println("program selesai")
    }
}