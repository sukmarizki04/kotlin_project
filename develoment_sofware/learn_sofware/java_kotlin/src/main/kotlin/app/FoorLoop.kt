fun main() {
    var  data = arrayOf("sukma","iyan","adi","c","d","e")
    var angka = 0;
    for (nama in data){
        println(nama)
        angka++
    }
    println("Total perulangan = $angka")

    for (i in 100 downTo 0 step 2) {
        println(i)
    }

}