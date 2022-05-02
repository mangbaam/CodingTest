package programmers.lv1

class Solution12950 {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arrayOf<IntArray>()
        val rows = arr1.size
        val cols = arr1[0].size
        println("행 수: $rows, 열 수: $cols")
        for (i in 0 until rows) {
            answer += IntArray(cols) { arr1[i][it] + arr2[i][it] }
        }
        return answer
    }
}