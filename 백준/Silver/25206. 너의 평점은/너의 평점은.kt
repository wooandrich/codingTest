import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    var cnt = 0.0
    var value = 0.0

    repeat(20) {
        val st = StringTokenizer(readLine())

        val s = st.nextToken()
        val a = st.nextToken().toDouble()
        val b = st.nextToken()

        when (b) {
            "A+" -> {
                cnt += a
                value += 4.5 * a
            }
            "A0" -> {
                cnt += a
                value += 4.0 * a
            }
            "B+" -> {
                cnt += a
                value += 3.5 * a
            }
            "B0" -> {
                cnt += a
                value += 3.0 * a
            }
            "C+" -> {
                cnt += a
                value += 2.5 * a
            }
            "C0" -> {
                cnt += a
                value += 2.0 * a
            }
            "D+" -> {
                cnt += a
                value += 1.5 * a
            }
            "D0" -> {
                cnt += a
                value += 1.0 * a
            }
            "F" -> {
                cnt += a
                value += 0.0
            }
        }

    }

    println(value / cnt)










}