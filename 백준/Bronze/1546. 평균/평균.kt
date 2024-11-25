import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val n = readLine().toInt()

    val st = StringTokenizer(readLine())

    var arr = Array(n) {st.nextToken().toDouble()}

    val maxValue = arr.max()

    arr.forEachIndexed { idx, value -> arr[idx] = value / maxValue * 100}

    println(arr.average())









}