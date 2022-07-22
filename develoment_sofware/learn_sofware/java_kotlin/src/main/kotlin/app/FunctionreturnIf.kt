fun main() {
    fun sayHello(name: String= ""):String {

        return when(name){
            "" ->  "Hello Bro"
            else ->  "Hello $name"
        }
        //if(name == "") {
       //     return "sukma rizki"
     //   } else {
   //       return "Hello $name"
 //       }
    }

    println(sayHello("sukma"))
    println(sayHello())
}