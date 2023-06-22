class Solution {
    fun solution(my_string: String, index_list: IntArray): String = index_list.fold(StringBuilder()) { acc, i ->
        acc.append(my_string[i])
    }.toString()
}