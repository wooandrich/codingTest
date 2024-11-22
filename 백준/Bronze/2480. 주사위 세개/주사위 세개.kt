import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    val st = StringTokenizer(readLine())

    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val c = st.nextToken().toInt()

    if (a == b && a == c) {
        println(10000 + a * 1000)

    }else if (a == b || a == c) {
        println(1000 + a * 100)
    } else if (b == c) {
        println(1000 + b * 100)
    }else if (c == a || c == b) {
        println(1000 + c * 100)
    }else {
        println(maxOf(a,b,c) * 100)
    }
}