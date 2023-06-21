class Solution {
    fun solution(n: Int): Int {
        var cnt = 0
        (1 .. n).forEach { i -> 
            if (n % i == 0) cnt++
        }
        return cnt
    }
}