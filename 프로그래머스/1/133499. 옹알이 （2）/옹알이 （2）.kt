class Solution {
    fun solution(babbling: Array<String>): Int {
        val validWord = listOf("aya", "ye", "woo", "ma")
        return babbling.filterNot { bab ->
            validWord.any { bab.contains(it.repeat(2)) }
        }.map {
            val bab = StringBuilder(it)
            var valid = 1
            while (bab.isNotEmpty()) {
                if (validWord.none { bab.startsWith(it) }) {
                    valid = 0
                    break
                }
                bab.delete(0, validWord.first { bab.startsWith(it) }.length)
            }
            valid
        }.sum()
    }
}