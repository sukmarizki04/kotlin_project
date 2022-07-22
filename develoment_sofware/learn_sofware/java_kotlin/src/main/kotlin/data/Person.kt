package data

class Person {
    var namaawal: String = ""
    var namatengah: String? = null
    var namaakhir: String = ""

    fun sayHello(name: String) {
        println("Hello $name,my name is ${this.namaawal}")
    }
    fun sayHello(namaawal: String,namaakhir : String) {
        println("Hello $namaawal,my name is ${this.namaawal}")
    }
    fun run() {
        println("I'm Run")
    }
    fun getfullName(): String{
        return "$namaawal $namatengah $namaakhir"
    }

}