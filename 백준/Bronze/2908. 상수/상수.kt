import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val st = StringTokenizer(readLine())

    val a = st.nextToken()
    val b = st.nextToken()

    println(maxOf(a.reversed(), b.reversed()))









}