package data.Appp

import data.Gender

fun main() {
    val man = Gender.MALE
    val women = Gender.FEMALE
    val allGenders:Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    val womenFromString = Gender.valueOf("FEMALE")


    println(man)
    println(women)
    println(allGenders.toList())

    man.showdescription()
    women.showdescription()

}