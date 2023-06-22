class Solution {
    fun solution(str1: String, str2: String): String = StringBuilder().apply {
        repeat(str1.length) {
            append(str1[it])
            append(str2[it])
        }
    }.toString()
}