class Solution {
    fun solution(myString: String): String = myString.map {
        if (it < 'l') 'l' else it
    }.joinToString("")
}