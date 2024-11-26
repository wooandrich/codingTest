import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    var arr = Array(9){Array(9) { 0} }

    var value = 0
    var col = 0
    var row = 0

    repeat(9) {i ->
        val st = StringTokenizer(readLine())
        repeat(9) {j ->
            arr[i][j] = st.nextToken().toInt()

            if (arr[i][j] > value) {
                value = arr[i][j]
                col = i
                row = j
            }
        }
    }

    println(value)
    println("${col + 1} ${row + 1}")
















}