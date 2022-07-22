fun main() {
    val sahabat: Array<String> = arrayOf( "sukma","adi","aldo")
    val nomor: Array<Byte> = arrayOf(100,2,0,1,4)
    val balances: Array<Int> = arrayOf(10_000, 20_000, 30_0000)

    //sahabat.set(0,"eko")
    sahabat[0] = "andi"
    println(sahabat[0])
    println(nomor[0])
    println(nomor[1])
    println(nomor[2])
    println(balances)

    val data: Array<String?> = arrayOfNulls(7)
    data[0]="sukma"
    data[1]="sudirman"
    data[2]="suwandi"
    data[3]="marle"
    data[4]= null
    data[5]="heru"
    data[6]="andi"

    println(data.size)




    println(data[5])


}