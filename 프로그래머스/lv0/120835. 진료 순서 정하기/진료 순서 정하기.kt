class Solution {
    fun solution(emergency: IntArray): IntArray {
        val emergencyMap = hashMapOf<Int, Int>()
        emergency.sortedByDescending { it }.fold(1) { i, emer ->
            emergencyMap.put(emer, i)
            i + 1
        }
        return emergency.map { emergencyMap.getValue(it) }.toIntArray()
    }
}