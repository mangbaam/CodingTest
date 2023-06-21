class Solution {
    fun solution(my_string: String): String {
        return my_string.filterNot { c -> listOf('a', 'e', 'i', 'o', 'u').contains(c) }.toString()
    }
}