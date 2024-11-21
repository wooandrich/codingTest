import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())
    
    val a = Integer.parseInt(st.nextToken())
    val b = Integer.parseInt(st.nextToken())
    
    print(a + b)

}