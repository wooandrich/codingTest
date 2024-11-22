import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    var n = readln().toInt()

    var ans = ""

    n /= 4

    for (i in 0 until n) {
        ans += "long "
    }
    println(ans + "int")

}