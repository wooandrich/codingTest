import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    var arr = Array(5) {Array(15){""}}

    repeat(5) {
        i ->
        val input = readLine()
        repeat(input.length) {
            j ->
            arr[i][j] = input[j].toString()
        }
    }

    var sb = StringBuilder()

    repeat(15) {
        j ->
        repeat(5) {
            i ->
            sb.append(arr[i][j])
        }
    }
    println(sb.toString())








}