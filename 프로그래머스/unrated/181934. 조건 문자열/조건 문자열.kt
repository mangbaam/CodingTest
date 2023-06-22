class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        return when ("$ineq$eq") {
            ">=" -> n >= m
            "<=" -> n <= m
            ">!" -> n > m
            "<!" -> n < m
            else -> throw IllegalStateException("")
        }.run {
            if (this) 1 else 0 
        }
    }
}