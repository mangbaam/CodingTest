package programmers.lv1

/**
 * https://programmers.co.kr/learn/courses/30/lessons/72410?language=kotlin
 * */

fun solution(new_id: String): String {
    var answer: String

    answer = new_id.lowercase().filter { it.isDigit() || it.isLowerCase() || it=='-' || it=='_' || it=='.'}
    while (answer.contains("..")) answer = answer.replace("..", ".")
    answer = answer.removePrefix(".").removeSuffix(".").ifEmpty { "a" }
    if (answer.length >= 16) answer = answer.slice(0 until 15)
    answer = answer.removeSuffix(".")
    while (answer.length <= 2) answer += answer.last()
    return answer
}

fun main() {
    solution("...!@BaT#*..y.abcdefghijklm"	)
    solution("z-+.^.")
    solution("=.=")
    solution("123_.def")
    solution("abcdefghijklmn.p")
}