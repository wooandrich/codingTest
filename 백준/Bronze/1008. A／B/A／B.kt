import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())

    val a = st.nextToken().toDouble()
    val b = st.nextToken().toDouble()

    print(a / b)

}