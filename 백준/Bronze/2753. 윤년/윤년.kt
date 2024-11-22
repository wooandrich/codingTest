import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    val n = readln().toInt()

    if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
        println(1)

    } else {
        println(0)
    }



}