class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        return tangerine
            .asSequence()
            .groupBy { it }
            .values
            .map { it.size }
            .sortedDescending()
            .let {
                sequence<Int> {
                    var next = 0
                    it.forEach { 
                        next += it
                        yield(next)
                    }
                }
            }
            .indexOfFirst { it >= k } + 1
    }
}