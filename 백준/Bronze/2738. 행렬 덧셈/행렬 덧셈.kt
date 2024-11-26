import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    var st = StringTokenizer(readLine())

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    var a = Array(n) {Array(m) {0} }
    var b = Array(n) {Array(m) {0} }

    for (i in 0 until n) {
        st = StringTokenizer(readLine())

        for (j in 0 until m) {
            a[i][j] = st.nextToken().toInt()
        }
    }

    for (i in 0 until n) {
        st = StringTokenizer(readLine())

        for (j in 0 until m) {
            b[i][j] = st.nextToken().toInt()
        }
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            a[i][j] += b[i][j]
        }
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            print("${a[i][j]} ")
        }
        print("\n")
    }
















}