package data

class Car(Parambrand: String,ParamType: String,Paramyear: Int) {



    init {
        println("Car $Parambrand di buat")
    }

    constructor(Parambrand: String,ParamType: String ): this(Parambrand,ParamType,2003){
        println("Secondary Constraktor 1")
    }
    constructor(Parambrand: String): this(Parambrand, ""){
        println("Secondary Constractor 2")
    }
    var brand: String = Parambrand
    var Type: String = ParamType
    var year: Int = Paramyear
}