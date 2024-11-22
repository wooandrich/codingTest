import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    val n = readln().toInt()

    var ans = 0

    for (i in 1..n) {
        ans += i

    }
    println(ans)
}