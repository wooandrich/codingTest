import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    var ans = 0

    repeat(readLine().toInt()) {
        val s = readLine()
        var arr = mutableSetOf<Char>()
        var flag = true

        for (i in s.indices) {
            if (!arr.contains(s[i])) {
                arr.add(s[i])
            }else {
                if (s[i - 1] != s[i]) {
                    flag = false
                    break
                }
            }
        }
        if (flag) {
            ans++
        }

    }
    println(ans)










}