import kotlin.math.*

class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        for (i in (arr.size % 2 - 1).absoluteValue .. arr.lastIndex step 2) {
            arr[i] += n
        }
        return arr
    }
}