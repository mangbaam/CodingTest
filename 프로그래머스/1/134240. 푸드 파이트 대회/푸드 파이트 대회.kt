class Solution {
    fun solution(food: IntArray): String {
        val left = buildList<Int> {
            for (i in 1 until food.size) {
                repeat(food[i] / 2) {
                    add(i)
                }
            }
        }
        return "${left.joinToString("")}0${left.reversed().joinToString("")}"
    }
}