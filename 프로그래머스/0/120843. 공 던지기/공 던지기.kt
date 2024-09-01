class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        return numbers[(k - 1) * 2 % numbers.size]
    }
}