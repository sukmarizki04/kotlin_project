fun namaPenuh(firsName: String, MiddleName: String,lastName : String) {
    println("Hello $firsName $MiddleName $lastName")
}




fun main() {
    namaPenuh("SUKMA","RIZKI","JAYA")
    namaPenuh(
        lastName = "JAYA",
        MiddleName = "RIZKI",
        firsName = "SUKMA"
    )
}