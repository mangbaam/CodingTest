class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer = 0
        (0..myString.lastIndex-pat.length + 1).forEach {
            if (myString.substring(it, it + pat.length) == pat) answer++
        }
        return answer
    }
}