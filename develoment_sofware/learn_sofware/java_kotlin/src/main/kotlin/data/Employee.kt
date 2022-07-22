package data

open class Employee(val name: String) {
    open fun SayHello(name: String) {
        println("Hello $name, My name is manajer ${this.name}")
    }
}

open class Manager(name: String) : Employee(name) {
    override fun SayHello(name: String) {
        println("Hello $name, My name is ${this.name}")

    }
}
class SuperManager(name: String) : Manager(name) {
//    override fun SayHello(name: String) {
//        println("Hello $name, My name is SuperManager${this.name}")
//    }
}

class Viccepresident(name: String) : Employee(name)  {
    override fun SayHello(name: String) {
        println("Hello $name, My name is vice president ${this.name}")

    }
}
