class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var price = mutableListOf<Int>()
        return buildList<Int> {
            score.forEachIndexed { i, score ->
                price.add(score)
                price.sortDescending()
                if (price.size > k) price = price.slice(0 until k).toMutableList()
                add(price.last())
            }
        }.toIntArray()
    }
}