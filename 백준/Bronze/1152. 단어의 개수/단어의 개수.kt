import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val st = StringTokenizer(readLine())

    var arr = ArrayList<String>()

    while (st.hasMoreTokens()) {
        val token = st.nextToken()
        arr.add(token)
    }
    println(arr.size)









}