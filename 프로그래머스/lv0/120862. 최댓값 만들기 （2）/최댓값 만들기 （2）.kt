class Solution {
    fun solution(numbers: IntArray): Int {
        return numbers.sorted().let {
            val head = it[0] * it[1]
            val tail = it[it.lastIndex] * it[it.lastIndex - 1]
            maxOf(head, tail)
        }
    }
}