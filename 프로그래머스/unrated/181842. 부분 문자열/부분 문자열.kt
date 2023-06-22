class Solution {
    fun solution(str1: String, str2: String): Int = (str1 in str2).toInt()
}

fun Boolean.toInt(): Int = if(this) 1 else 0