class Solution {
    fun solution(num_list: IntArray): Int {
        val even = StringBuilder()
        val odd = StringBuilder()
        num_list.forEach {
            if (it % 2 == 0) even.append(it) else odd.append(it)
        }
        return even.toString().toInt() + odd.toString().toInt()
    }
}