import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    var arr = IntArray(31)

    repeat(28) {
        val num = readLine().toInt()

        arr[num] = 1
    }

    (1..30).filter { arr[it] != 1 }.forEach {println(it)}




}