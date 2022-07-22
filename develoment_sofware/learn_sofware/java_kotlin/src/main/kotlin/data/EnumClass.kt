package data

enum class Gender(val description:String) {
    MALE("male"),
    FEMALE("female");

    fun showdescription(){
        println(description)
    }

}