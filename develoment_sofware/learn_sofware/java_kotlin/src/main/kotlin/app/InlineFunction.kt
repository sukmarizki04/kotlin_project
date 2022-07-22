inline fun hello(
    firstName: () -> String,
    noinline lastName:() -> String
): String {


    return "Helllo ${firstName()} ${lastName()}"
}
fun main() {
    for (i in 0..100) {
        println(hello({"sukma"}, {"rizki"}))
    }
}