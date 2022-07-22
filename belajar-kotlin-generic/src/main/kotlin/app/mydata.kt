package app

class mydata<T,U> (val firstdata: T,val secondData: U) {

    fun getData(): T = firstdata

    fun getsecond(): U = secondData


    fun printlnData(){
        println("Data is $firstdata $secondData ")

    }

}