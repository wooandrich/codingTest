import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    while (true) {
        val st = StringTokenizer(readLine())

        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        if (a == 0 && b == 0) {
            break
        }

        println(a + b)
    }

}