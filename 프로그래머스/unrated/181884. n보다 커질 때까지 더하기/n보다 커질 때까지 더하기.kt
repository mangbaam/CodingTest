class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var answer: Int = 0
        var i = 0
        do {
            answer += numbers[i++]
        } while (answer <= n)
        return answer
    }
}