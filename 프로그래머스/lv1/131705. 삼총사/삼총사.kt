class Solution {
    fun solution(number: IntArray) = combi(number, 3).count { it.sum() == 0 }
}

fun combi(array: IntArray, count: Int): List<List<Int>> {
    val list = mutableListOf<List<Int>>()
    val n = array.size

    fun innerCombi(depth: Int = 0, index: Int = 0, resultArray: IntArray = array.sliceArray(0 until count)) {
        if (depth == count) {
            list.add(resultArray.toList())
            return
        }

        for (arrayIndex in index until n) {
            resultArray[depth] = array[arrayIndex]
            innerCombi(depth + 1, arrayIndex + 1, resultArray)
        }
    }

    innerCombi()
    return list
}