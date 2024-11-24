import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {



    var arr = IntArray(9)

    for (i in 0 until 9) {
        arr[i] = readLine().toInt()
    }

    println(arr.max())
    println(arr.indexOf(arr.max()) + 1)
}