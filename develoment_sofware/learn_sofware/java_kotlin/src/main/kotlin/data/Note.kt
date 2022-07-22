package data

import java.lang.reflect.Field

class Note(title:String) {

    var title: String = title
        get() {
            println("call getter Function")
            return field
        }
    set (value) {
        println("Call Setter Function")
        if (value.isNotBlank()){
            field = value
        }
    }

}

class BigNote(val title: String) {
    val bigtitle:String
        get() = title.toUpperCase()

}