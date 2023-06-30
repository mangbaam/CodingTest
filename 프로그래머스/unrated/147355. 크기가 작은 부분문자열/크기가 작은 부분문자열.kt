class Solution {
    fun solution(t: String, p: String) = t.windowed(p.length).count { it.toLong() <= p.toLong() }
}