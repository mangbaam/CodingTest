class Solution {
    fun solution(s: String): String {
        return s.split(" ").map {
            when (it.length) {
                0 -> ""
                1 -> it.uppercase()
                else -> it.first().uppercase() + it.slice(1 .. it.lastIndex).lowercase()
            }
        }.joinToString(" ")
    }
}