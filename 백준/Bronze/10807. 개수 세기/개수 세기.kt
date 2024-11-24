import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    val n = readLine().toInt()

    val st = StringTokenizer(readLine())

    var arr = Array(n) { i -> st.nextToken().toInt() }

    val find = readLine().toInt()

    println(arr.count { it == find })

}