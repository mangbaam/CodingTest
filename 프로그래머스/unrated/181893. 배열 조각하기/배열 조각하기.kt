class Solution {
    fun solution(arr: IntArray, query: IntArray): List<Int> {
        var answer = arr.toList()
        query.forEachIndexed { i, x ->
            if (i % 2 == 1) {
                answer = answer.drop(x)
            } else {
                answer = answer.dropLast(answer.size - x - 1)
            }
        }
        return answer
    }
}