package app

class Function(val name: String) {

    fun <T>sayHello(param: T){
        println("Hello $param myname is $name")
    }


}