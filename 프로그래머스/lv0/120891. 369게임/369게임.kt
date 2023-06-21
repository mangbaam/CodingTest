class Solution {
    fun solution(order: Int) = order.toString().count { arrayOf('3', '6', '9').contains(it) }
}