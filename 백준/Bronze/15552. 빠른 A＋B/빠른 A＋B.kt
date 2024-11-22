import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    val n = readLine().toInt()
    var ans = StringBuilder()

    for (i in 0 until n) {
        val st = StringTokenizer(readLine())

        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        ans.append(a + b).append("\n")
    }
    println(ans.toString())

}