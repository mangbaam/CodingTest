class Solution {
    fun solution(s: String): Int {
        return s.split(' ').let { li ->
            li.filterIndexed { i, n ->
                n != "Z" && i < li.lastIndex && li[i + 1] != "Z" || i == li.lastIndex && n != "Z"
            }.map { it.toInt() }.sum()
        }
    }
}