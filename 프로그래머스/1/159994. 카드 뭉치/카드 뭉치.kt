class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var i = 0
        var j = 0
        var valid = true
        goal.forEach {
            when {
                i <= cards1.lastIndex && cards1[i] == it -> i++
                j <= cards2.lastIndex && cards2[j] == it -> j++
                else -> {
                    valid = false
                    return@forEach
                }
            }
        }
        return if (valid) "Yes" else "No"
    }
}