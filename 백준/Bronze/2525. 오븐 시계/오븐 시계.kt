import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    val st = StringTokenizer(readLine())

    var h = st.nextToken().toInt()
    var m = st.nextToken().toInt()

    val c = readLine().toInt()

    m += c

    h += m / 60
    m %= 60

    println("${h % 24} $m")


}