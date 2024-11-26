import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    repeat(readLine().toInt()) {
        val s = readLine()

        println("${s[0]}${s[s.length - 1]}")
    }









}