class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        return score
            .asSequence()
            .sortedDescending()
            .chunked(m)
            .filter { it.size == m }
            .map { it.last() * it.size }
            .sum()
    }
}