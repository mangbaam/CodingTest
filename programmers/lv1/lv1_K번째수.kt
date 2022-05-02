package programmers.lv1

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 * */

fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
    var answer = intArrayOf()
    commands.forEach {
        val (start, end, i) = it
        answer += array.copyOfRange(start - 1, end).sorted()[i - 1]
    }
    return answer
}