import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    var st = StringTokenizer(readLine())

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    var arr = IntArray(n)

    for (i in 0 until m) {
        st = StringTokenizer(readLine())

        val start = st.nextToken().toInt()
        val end = st.nextToken().toInt()
        val num = st.nextToken().toInt()

        for (j in start - 1 until end) {
            arr[j] = num
        }
    }

    arr.forEach { print("$it ")  }



}