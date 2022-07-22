fun fullName(firstName:String,
            middleName:String,
            lastName:String){
    println("Hello $firstName $middleName $lastName")
}


fun main() {
    fullName("SUKMA","BUDI","EKO")
    fullName(
        lastName = "BUDI",
        firstName = "EKO",
        middleName = "SUKMA"

    )
}