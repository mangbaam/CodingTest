class Solution {
    fun solution(strArr: Array<String>): Array<String> = strArr.mapIndexed { i, s ->
        if (i % 2 == 0) s.lowercase() else s.uppercase()
    }.toTypedArray()
}