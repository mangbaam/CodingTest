class Solution {
    fun solution(my_string: String): String = my_string.toCharArray().joinToString("") {
        when {
            it.isUpperCase() -> it.lowercase()
            else -> it.uppercase()
        }
    }
}