fun main() {
    val example = "D"
    val nilai = "B"


    when(example)  {
        "A" -> {
            println("LuaarBiasa")
        }
        "B" -> {
            println("Biasa")
        }
        "C" -> {
            println("Cukup")
        }
        else -> {
            println("Coba lagi tahun Depan")
        }
    }
    when(nilai){
        "A","B","C" -> {
            println("Selamat Anda Mengikuti Kelas  Selanjutnya")
        }
        else -> {
            print("Maaf anda dinyatakan tidak mencukupi syarat")
        }
    }

    val nilailulus: Array<String> = arrayOf("A","B","C")
    when (nilai) {
        in nilailulus -> println("SELAMAT ANDA DINYATAKAN LULUS")
        !in nilailulus -> println("MAAF,ANDA TIDAK DINYATAKAN LULUS")
    }
}