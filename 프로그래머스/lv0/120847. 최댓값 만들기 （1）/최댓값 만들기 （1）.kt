class Solution {
    fun solution(numbers: IntArray): Int {
        return numbers.sortedByDescending { it }.let {
            return@let it[0] * it[1]
        }
    }
}