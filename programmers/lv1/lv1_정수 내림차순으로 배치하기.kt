package programmers.lv1

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12933?language=kotlin
 * */

class Solution12933 {
    fun solution(n: Long): Long {
        return n.toString().toList().sortedDescending().joinToString("").toLong()
    }
}