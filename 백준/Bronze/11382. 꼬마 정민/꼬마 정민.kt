import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val st = StringTokenizer(readLine())

    val a = st.nextToken().toBigInteger()
    val b = st.nextToken().toBigInteger()
    val c = st.nextToken().toBigInteger()

    println(a + b + c)


}