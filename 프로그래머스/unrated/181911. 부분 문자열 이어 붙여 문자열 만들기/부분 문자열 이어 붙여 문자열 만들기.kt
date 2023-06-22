class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>) = my_strings.mapIndexed { i, word ->
        word.substring(parts[i][0], parts[i][1] + 1)
    }.joinToString("")
}