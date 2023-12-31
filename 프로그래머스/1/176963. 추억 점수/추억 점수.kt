class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val yearnMap = name.toList().zip(yearning.toList()).toMap()
        return buildList<Int> {
            photo.forEach {
                add(it.map { yearnMap[it] }.sumOf { it ?: 0 })
            }
        }.toIntArray()
    }
}