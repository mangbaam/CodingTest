class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        return generateSequence(a) { it + d }
            .take(included.size)
            .filterIndexed { i, _ -> included[i] }
            .sum()
    }
}