package data.Appp

import data.Person


fun main() {
    val sukma = Person()
    sukma.namaawal = "sukma"
    sukma.namatengah = "rizki"
    sukma.namaakhir = "jaya"

    sukma.sayHello("jaya")
    sukma.run()

    val fullName = sukma.getfullName()
    println(fullName)
}