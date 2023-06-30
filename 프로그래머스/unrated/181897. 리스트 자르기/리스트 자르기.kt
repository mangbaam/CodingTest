class Solution {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): List<Int> {
        val (a, b, c) = slicer
        val li = num_list.toList()
        return when (n) {
            1 -> li.subList(0, b + 1)
            2 -> li.subList(a, li.size)
            3 -> li.subList(a, b + 1)
            else -> li.subList(a, b + 1).filterIndexed { i, _ -> i % c == 0 }
        }
    }
}