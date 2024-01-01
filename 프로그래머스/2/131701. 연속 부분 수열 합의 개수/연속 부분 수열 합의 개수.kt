class Solution {
    fun solution(elements: IntArray): Int {
        val doubleElements = elements + elements
        val numberSet = mutableSetOf<Int>()
        for (i in elements.indices) {
            for (j in elements.indices) {
                numberSet.add(doubleElements.slice(j .. i + j).sum())
            }
        }
        return numberSet.size
    }
}