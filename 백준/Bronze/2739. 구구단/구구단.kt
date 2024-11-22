import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    val n = readln().toInt()

    for (i in 1..9) {
        println("$n * $i = ${n * i}")
    }
}