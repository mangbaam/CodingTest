class Solution {
    fun solution(stones: IntArray, k: Int): Int {
        var (left, right) = Pair(0, 200_000_000)
        
        while (left <= right) {
            val mid = (left + right) / 2
            if (check(stones, mid, k)) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return left
    }

    private fun check(li: IntArray, minus: Int, k: Int): Boolean {
        var count = 0
        for (x in li) {
            if (x - minus <= 0) {
                count++
            } else {
                count = 0
            }
            if (count == k) return true
        }
        return false
    }
}