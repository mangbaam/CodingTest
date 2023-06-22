class Solution {
    fun solution(my_string: String, indices: IntArray): String = my_string.filterIndexed { i, _ ->
        indices.contains(i).not()
    }.toString()
}