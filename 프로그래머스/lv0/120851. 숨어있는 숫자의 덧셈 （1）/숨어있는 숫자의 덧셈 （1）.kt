class Solution {
    fun solution(my_string: String): Int {
        return my_string.filter { it.isDigit() }.fold(0) { acc, i ->
            acc + i.digitToInt()
        }
    }
}