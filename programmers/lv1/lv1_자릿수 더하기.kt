package programmers.lv1

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12931
 * */

class Solution12931 {
    fun solution(n: Int) = n.toString().fold(0) { acc, c -> acc + c.toString().toInt() }
}