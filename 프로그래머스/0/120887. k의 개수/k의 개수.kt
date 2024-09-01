class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        return (i .. j).asSequence().map { 
            it.toString().count { it == k.toString().first() }
        }.sum()
    }
}