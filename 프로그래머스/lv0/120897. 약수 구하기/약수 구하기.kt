import kotlin.math.*

class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        (1 .. sqrt(n.toDouble()).toInt()).forEach {
            if (n % it == 0) {
                answer += it
                answer += (n / it).toInt()
            }
        }
        return answer.toSet().sorted().toIntArray()
    }
}