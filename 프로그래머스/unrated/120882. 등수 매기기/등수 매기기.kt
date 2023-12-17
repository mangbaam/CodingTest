class Solution {
    fun solution(score: Array<IntArray>): IntArray {
        val avers = score.map(IntArray::average)
        val sorted = avers.sorted().reversed()
        
        return avers.map {
            sorted.indexOf(it) + 1
        }.toIntArray()
    }
}