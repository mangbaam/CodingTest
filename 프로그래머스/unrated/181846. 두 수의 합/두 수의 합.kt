import java.math.BigDecimal

class Solution {
    fun solution(a: String, b: String): String {
        return (BigDecimal(a) + BigDecimal(b)).toString()
    }
}