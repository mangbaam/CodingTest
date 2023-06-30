class Solution {
    fun solution(l: Int, r: Int) = (l..r)
        .filter { setOf('0', '5').containsAll(it.toString().toSet()) }
        .let { if (it.isEmpty()) listOf(-1) else it }
}