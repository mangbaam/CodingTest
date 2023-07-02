class Solution {
    fun solution(numbers: IntArray) = numbers
        .sortedByDescending { it.toString().repeat(3) }
        .joinToString("")
        .trimStart('0')
        .toString()
        .let {
        if (it.isBlank()) "0" else it
    }
}