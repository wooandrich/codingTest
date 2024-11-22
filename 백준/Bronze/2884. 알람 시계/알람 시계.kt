import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    val st = StringTokenizer(readLine())

    val h = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    if (m >= 45) {
        println("$h ${m-45}")
    }else{
        if (h == 0) {
            println("23 ${m + 15}")
        }else {
            println("${h-1} ${m + 15}")
        }
    }



}