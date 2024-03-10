class Solution {
    fun solution(s: String): String = s.split(" ")
        .map(String::toInt)
        .sorted()
        .let { "${it.first()} ${it.last()}" }
}