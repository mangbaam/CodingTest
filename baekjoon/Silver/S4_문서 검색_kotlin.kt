package Silver

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    var word = readLine()
    val target = readLine()
    var i: Int
    var answer = 0
    while (true) {
        i = word.indexOf(target)
        if(i == -1) break
        answer++
        word = word.substring(i + target.length)
    }
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    bw.write(answer.toString() + "\n")
    bw.flush()
    bw.close()
}