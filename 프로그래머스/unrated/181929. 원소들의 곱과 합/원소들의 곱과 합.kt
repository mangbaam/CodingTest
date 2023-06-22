import kotlin.math.pow

class Solution {
    fun solution(num_list: IntArray): Int = if (num_list.reduce { acc, i -> acc * i } > num_list.sum().toFloat().pow(2)) 0 else 1
}