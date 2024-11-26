import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    var ans = IntArray(26)

    val s = readLine()

    for (c in s) {
        val k = c.uppercaseChar() - 'A'
        ans[k]++
    }

    val cnt = ans.max()

    if (ans.count { it == cnt } > 1) {
        println("?")
    } else {
        println('A' + ans.indexOf(cnt))
    }










}