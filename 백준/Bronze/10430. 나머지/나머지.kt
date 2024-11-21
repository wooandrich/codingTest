import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val st = StringTokenizer(readLine())

    val A = st.nextToken().toInt()
    val B = st.nextToken().toInt()
    val C = st.nextToken().toInt()

    println((A+B)%C)
    println(((A%C) + (B%C))%C)
    println( (A*B)%C)
    println(((A%C) * (B%C))%C)

}