import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    val (n, b) = readLine().split(" ").map { it.toInt() }

    println(n.toString(b).uppercase())





}