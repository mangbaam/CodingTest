class Solution {
    fun solution(num_list: IntArray): Int {
        var odd = 0
        var even = 0
        num_list.forEachIndexed { i, n ->
            if (i % 2 == 0) odd += n else even += n
        }
        return maxOf(odd, even)
    }
}