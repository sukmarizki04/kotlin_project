package data

class Adress {
    var Street: String = ""
    var city: String = ""
    var country: String = "INDONESIA"

    constructor(ParamStreet: String,ParamCity:String){
        Street = ParamStreet
        city = ParamCity
    }
    constructor(ParamStreet: String,ParamCity: String,Paramcountry: String)
            : this(ParamStreet,ParamCity){

    }
}