package lv1

/**
 * https://programmers.co.kr/learn/courses/30/lessons/81301?language=kotlin
 * */

fun solution(s: String): Int {
    var answer = s
    val numberMapper = mapOf(
        "one" to "1",
        "two" to "2",
        "three" to "3",
        "four" to "4",
        "five" to "5",
        "six" to "6",
        "seven" to "7",
        "eight" to "8",
        "nine" to "9",
        "zero" to "0"
    )
    numberMapper.forEach {str, num ->
        answer = answer.replace(str, num)
    }

    return answer.toInt()
}

fun main() {
    println(solution("one4seveneight"))
    println(solution("23four5six7"))
    println(solution("2three45sixseven"))
    println(solution("123"))
}