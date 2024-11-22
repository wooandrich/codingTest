import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    val n = readLine().toInt()

    for (i in 1..n) {
        println("*".repeat(i))
    }

}