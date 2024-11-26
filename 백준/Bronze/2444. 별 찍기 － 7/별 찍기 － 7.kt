import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val n = readLine().toInt()

    repeat(n - 1) {
        println(" ".repeat(n - it - 1) +"*".repeat((it + 1) * 2 - 1))
    }

    println("*".repeat(2*n - 1))

    repeat(n - 1) {
        println(" ".repeat(it + 1) + "*".repeat((n - it - 1) * 2 - 1))
    }










}