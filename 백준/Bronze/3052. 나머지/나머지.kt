import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    var arr = mutableSetOf<Int>()

    for (i in 0 until 10) {
        val n = readLine().toInt()

        arr.add(n % 42)
    }

    println(arr.size)







}