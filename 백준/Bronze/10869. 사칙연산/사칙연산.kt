import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())

    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()

    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)


}