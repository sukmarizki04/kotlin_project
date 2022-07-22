package data


abstract class Hewan {
    abstract val name: String
    abstract fun run(): Unit
}

class Cat: Hewan() {
    override val name: String = "Cat"
    override fun run(){
        println("Cat run")
    }

}

class Jerapah: Hewan(){
    override val name: String = "Jerapah"
    override  fun run(){
        println("Jerapah run")
    }
}