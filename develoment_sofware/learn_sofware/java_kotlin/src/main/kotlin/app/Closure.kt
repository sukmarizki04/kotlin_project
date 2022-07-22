fun main() {
     var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("lambda Increment")
        counter++
    }
    val  anonymousIncrement = fun() {
        println("Anonymous Function increment")
        counter++
    }
    fun functionIncrement(){
        println("Function increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    println(counter)
}