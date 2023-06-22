class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = IntArray(52)
        my_string.forEach { if (it >= 'a') answer[it - 'a' + 26]++ else answer[it - 'A']++ }
        return answer
    }
}