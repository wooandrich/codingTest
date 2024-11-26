import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    var arr = arrayOf(1, 1, 2, 2, 2, 8)


    val st = StringTokenizer(readLine())

    var ans = Array(6)  {st.nextToken().toInt()}

    for (i in arr.indices) {
        arr[i] -= ans[i]
    }

    println(arr.joinToString(" "))










}