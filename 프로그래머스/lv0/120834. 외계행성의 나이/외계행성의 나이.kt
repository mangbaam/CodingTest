class Solution {
    fun solution(age: Int): String {
        val dict = ('0' .. '9').zip(('a'..'j')).toMap()
        return age.toString().map { dict[it] }.joinToString("")
    }
}