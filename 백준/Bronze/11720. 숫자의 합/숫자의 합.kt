import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    var ans = 0

    val n = readLine().toInt()

    val s = readLine()

    repeat(n) {
        ans += s[it] - '0'
    }

    println(ans)









}