class Solution {
    fun solution(arr: IntArray): IntArray {
        val s = arr.indexOf(2)
        if (s == -1) return intArrayOf(-1)
        val e = arr.indexOfLast { it == 2 }
        return arr.copyOfRange(s, e + 1)
    }
}