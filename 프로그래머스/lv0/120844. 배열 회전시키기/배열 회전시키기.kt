class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        return when (direction) {
            "right" -> numbers.rotate(1)
            else -> numbers.rotate(-1)
        }
    }
}

fun IntArray.rotate(n: Int) = let {
    if (n == 0) return this
    val i = (size + n) % size
    sliceArray(size - i until size) + sliceArray(0 until size - i)
}
