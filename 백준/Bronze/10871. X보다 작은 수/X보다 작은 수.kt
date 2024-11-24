import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    var st = StringTokenizer(readLine())

    val n = st.nextToken().toInt()
    val x = st.nextToken().toInt()

    st = StringTokenizer(readLine())

    var arr = IntArray(n) {i -> st.nextToken().toInt()}

    arr.filter { it < x }.forEach { print("$it ") }

}