import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    val x = readLine().toInt()
    val y = readLine().toInt()

    if (x > 0 && y > 0) {
        println(1)
    }else if (x < 0 && y > 0) {
        println(2)
    }
    else if (x < 0 && y < 0) {
        println(3)
    } else {
        println(4)
    }



}