import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    while (true) {
        val st = StringTokenizer(readLine() ?: break)

//        if (st.countTokens() < 2) break

        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()



        println(a + b)
    }

}