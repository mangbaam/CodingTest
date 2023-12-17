class Solution {
    fun solution(num: Int, total: Int): IntArray {
        val start = (total - (1..num).sum()) / num + 1
        return (start until start + num).toList().toIntArray()
    }
}