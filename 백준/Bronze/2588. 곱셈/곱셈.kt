import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val a = readln().toInt()
    val b = readln().toInt()

    println(a * (b % 10))
    println(a * (b / 10 % 10))
    println(a * (b / 100))
    println(a * b)


}