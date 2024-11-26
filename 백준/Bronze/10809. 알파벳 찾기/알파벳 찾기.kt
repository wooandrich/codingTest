import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    var arr = Array(26) { -1}

    val s = readLine()

    for (i in s.indices) {

        if (arr[s[i] - 'a'] == -1) arr[s[i] - 'a'] = i
    }

    println(arr.joinToString(" "))









}