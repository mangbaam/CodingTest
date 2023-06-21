class Solution {
    fun solution(array: IntArray): IntArray {
        val maxValue = array.maxOrNull() ?: -1
        return intArrayOf(maxValue, array.indexOf(maxValue))
    }
}