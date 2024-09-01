class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        val i = str_list.indexOfFirst {
            it in listOf("l", "r")
        }
        return when {
            i == -1 -> emptyArray<String>()
            str_list[i] == "l" -> str_list.sliceArray(0 until i)
            str_list[i] == "r" -> str_list.sliceArray(i + 1 .. str_list.lastIndex)
            else -> emptyArray<String>()
        }
    }
}