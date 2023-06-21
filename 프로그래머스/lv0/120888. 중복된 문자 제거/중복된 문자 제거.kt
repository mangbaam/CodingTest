class Solution {
    fun solution(my_string: String): String {
        val duplicated = hashSetOf<Char>()
        return my_string.filterNot {
            duplicated.contains(it).also { result ->
                if (!result) {
                    duplicated.add(it)
                }
            }
        }.toString()
    }
}