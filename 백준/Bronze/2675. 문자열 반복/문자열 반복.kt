import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    repeat(readLine().toInt()) {

        val st = StringTokenizer(readLine())
        var sb = StringBuilder()

        val n = st.nextToken().toInt()

        val s = st.nextToken()

        s.forEach { sb.append(it.toString().repeat(n)) }

        println(sb.toString())

    }









}