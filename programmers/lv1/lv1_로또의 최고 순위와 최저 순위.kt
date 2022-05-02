/**
 * https://programmers.co.kr/learn/courses/30/lessons/77484
 * */

import kotlin.math.*

class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val zeros = lottos.count {it == 0}
        val matches = lottos.toSet().intersect(win_nums.toSet()).size
        return intArrayOf(min(7 - (matches+zeros), 6), min(7 - matches, 6))
    }
}