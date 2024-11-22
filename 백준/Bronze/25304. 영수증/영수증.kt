import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    val n = readln().toInt()

    var ans = 0

    val cnt = readln().toInt()

    for (i in 0 until cnt) {
        val st = StringTokenizer(readLine())

        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        ans += a * b
    }
    if (ans == n) {
        println("Yes")
    } else {
        println("No")
    }
}