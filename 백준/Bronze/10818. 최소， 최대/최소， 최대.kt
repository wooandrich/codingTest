import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    val n = readLine().toInt()

    val st = StringTokenizer(readLine())

    var arr = Array(n) {i -> st.nextToken().toInt()}

    println("${arr.min()} ${arr.max()}")
}