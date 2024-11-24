import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    var st = StringTokenizer(readLine())

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    var arr = IntArray(n) {it + 1}

    for (i in 0 until m) {
        st = StringTokenizer(readLine())

        val a = st.nextToken().toInt() - 1
        val b = st.nextToken().toInt() - 1

        arr[a] = arr[b].also { arr[b] = arr[a] }
    }

    println(arr.joinToString(" "))


}