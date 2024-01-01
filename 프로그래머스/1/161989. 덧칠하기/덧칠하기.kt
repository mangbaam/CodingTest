class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var result = 1
        var i = 0
        var current = section.first()
        while (++i < section.size) {
            if (section[i] > current + m - 1) {
                current = section[i]
                result++
            }
        }
        return result
    }
}