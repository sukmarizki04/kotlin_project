package data

class Boos(val name: String) {

    inner class Employee(val name: String){
        fun hi(){
            println("Hi my name is $name,my name Bos is ${this@Boos.name}")
        }
    }

}