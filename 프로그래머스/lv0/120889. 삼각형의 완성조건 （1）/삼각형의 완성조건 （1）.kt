class Solution {
    fun solution(sides: IntArray): Int {
        val maxSide = sides.toList().maxOrNull() ?: 0
        return if (sides.sum() > maxSide + maxSide) 1 else 2
    }
}