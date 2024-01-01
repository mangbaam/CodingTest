import kotlin.math.*

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        fun getDivisorCount(num: Int): Int {
            var count = 0
            for (i in 1 .. sqrt(num.toFloat()).toInt()) {
                if (num % i == 0) {
                    count = if (num / i == i) count + 1 else count + 2 
                }
            }
            return count
        }
        
        return (1..number)
            .map(::getDivisorCount)
            .map { if (it > limit) power else it }
            .sum()
    }
}