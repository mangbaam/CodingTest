package Silver

/**
 * https://www.acmicpc.net/problem/1343
 * 1343_폴리오미노_kotlin (S5)
 * */

fun main() = with(System.`in`.bufferedReader()) {
    var answer = ""
    val poly = readLine().split(".")

    for (p in poly) {
        var part = p
        if (part.length % 2 == 1) {
            println(-1)
            answer = ""
            break
        }
        while(part.isNotEmpty()) {
            if (part.length >= 4) {
                answer += "AAAA"
                part = part.removeRange(0..3)
            } else if (part.length >= 2) {
                answer += "BB"
                part = part.removeRange(0..1)
            }
        }
        answer += "."
    }

    if (answer.isNotEmpty()) println(answer.dropLast(1))
}