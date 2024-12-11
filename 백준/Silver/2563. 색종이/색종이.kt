import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    val n = readLine().toInt()

    var ans = 0

    var arr = Array(n) {IntArray(2) {0} }

    repeat(n) {
        val st = StringTokenizer(readLine())

        arr[it][0] = st.nextToken().toInt()
        arr[it][1] = st.nextToken().toInt()

    }

    var check = Array(100) {IntArray(100) {0} }

    for (i in arr.indices) {
        var x = arr[i][0]
        var y = arr[i][1]

        for (j in x until x + 10) {
            for (k in y until y + 10) {
                if (check[j][k] == 0) check[j][k] = 1
            }
        }
    }

    for (i in 0 until 100) {
        for (j in 0 until 100) {
            if (check[i][j] == 1) ans++;
        }
    }

    println(ans)









}