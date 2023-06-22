class Solution {
    var ret = StringBuilder()

    fun reverse(query: IntArray) {
        val (s, e) = query
        val target = ret.subSequence(s, e + 1).reversed().toString()
        ret.setRange(s, e + 1, target)
    }

    fun solution(my_string: String, queries: Array<IntArray>): String {
        ret.append(my_string)
        queries.forEach(::reverse)
        return ret.toString()
    }
}