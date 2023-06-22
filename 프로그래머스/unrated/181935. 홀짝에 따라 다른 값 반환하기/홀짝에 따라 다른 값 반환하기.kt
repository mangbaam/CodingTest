class Solution {
    fun solution(n: Int): Int {
        return when {
            n % 2 == 0 -> (2..n step 2).map { it * it }.reduce { acc, i -> acc + i }
            else -> (1..n step 2).reduce { acc, i -> acc + i }
        }
    }
}