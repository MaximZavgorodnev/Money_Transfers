import java.util.*
import kotlin.math.roundToInt

fun main() {
    println("Програма подсчета комиссии.")
    val scan = Scanner(System.`in`)
    var result: Int
    val commission = 0.0075 // Комиссия 0.75%
    val minCommission = 35.0 // Минимальная комиссия 35 руб
    println("Введите сумму перевода:")
    var amount = scan.nextDouble() // для целых
    amount = amount * commission
    if (amount < minCommission) {
        result = (minCommission * 100).roundToInt()
        println("Комиссия за перевод составляет: $result копеек")
    } else {
        result = (amount * 100).roundToInt()
        println("Комиссия за перевод составляет: $result копеек")
    }
}