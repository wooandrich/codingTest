import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val s = readLine()

    val ans = s.replace("c=", "1").replace("c-", "1").replace("dz=", "1").replace("d-", "1")
        .replace("lj", "1").replace("nj", "1").replace("s=", "1").replace("z=", "1")

    println(ans.length)










}