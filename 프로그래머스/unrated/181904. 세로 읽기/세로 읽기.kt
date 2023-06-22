class Solution {
    fun solution(my_string: String, m: Int, c: Int): String = my_string.filterIndexed { i, _ ->
        i % m == c - 1
    }.toString()
}