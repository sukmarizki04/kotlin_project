package data

class Student (val name:String, val age: Int)

fun Student?.sayHello(name:String){
   if ( this != null) {
       println("Hello $name my name is ${this.name},and my age${this.age}")
   }
}

val Student.upperName: String
        get() = this.name.toUpperCase()