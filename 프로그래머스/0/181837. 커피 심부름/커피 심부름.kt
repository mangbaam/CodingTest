class Solution {
    fun solution(order: Array<String>): Int {
        return order.map {
            if (it.contains("americano") || it == "anything") 4500 else 5000
        }.sum()
    }
}