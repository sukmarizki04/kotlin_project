fun main() {
    val nama = "19"
    when(nama)  {
        is String -> println("This is String")
        !is String -> println("This not String")
    }
}