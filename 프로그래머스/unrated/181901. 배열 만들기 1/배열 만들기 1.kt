class Solution {
    fun solution(n: Int, k: Int): IntArray {
        val answer = arrayListOf<Int>()
        for (i in k..n step k) {
            answer.add(i)
        }
        return answer.toIntArray()
    }
}