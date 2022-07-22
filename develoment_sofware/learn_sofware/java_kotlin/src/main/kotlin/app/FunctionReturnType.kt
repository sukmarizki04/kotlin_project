fun Jumlahkan(a:Int, b: Int):Int {
    val total= a + b
    return total
}

fun bagi(a:Int, b:Int):Int{
        if(b == 0){
            return 0
        } else {
            val result = a/b
            return result

        }

    }

fun main() {
    println(Jumlahkan(20,10))
    println(Jumlahkan(100,10))

    val result = Jumlahkan(200,200)
    println(result)

    val result2 = Jumlahkan(20,10)
    println(result2)

    println(bagi(10,10))
    println(bagi(100,0))
}