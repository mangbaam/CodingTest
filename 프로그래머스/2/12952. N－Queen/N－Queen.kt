import kotlin.math.abs

class Solution {
    fun dfs(queen: IntArray, n: Int, row: Int): Int {
        var count = 0
        if (n == row) return 1
        
        for (col in 0 until n) {
            queen[row] = col
            var c = true
            for (x in 0 until row) {
                if (queen[x] == queen[row]) {
                    c = false
                    break
                }
                if (abs(queen[x] - queen[row]) == (row - x)) {
                    c = false
                    break
                }
            }
            if(c) count += dfs(queen, n, row + 1)
        }
        return count
    }

    fun solution(n: Int): Int {
        var answer = 0
        val queen = IntArray(n)
        return dfs(queen, n, 0)
    }
}


/*
def solution(n):
    queen = [0] * n

    def dfs(queen, n, row):
        count = 0
        if n == row:
            return 1

        for col in range(n):
            queen[row] = col
            for x in range(row):
                if queen[x] == queen[row]: break # 세로 검사
                if abs(queen[x] - queen[row]) == (row - x): break # 대각선 검사
            else:
                count += dfs(queen, n, row + 1)
        return count

    return dfs(queen, n, 0)
*/