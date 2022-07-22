fun main() {
    val nilaiujian = 80
    val nilaiuts = 70
    val nilaiextra = 80

    val apakahlulusujian = nilaiujian  > 75
    val apakahnilaiuts = nilaiuts > 75
    val apakahnilaiextra = nilaiextra > 77
    val apakahlulus = apakahlulusujian && apakahnilaiuts && apakahnilaiextra
    //val apakahlulus = apakahlulusujian && apakahnilaiuts && apakahnilaiextra

    println(apakahlulus)
}