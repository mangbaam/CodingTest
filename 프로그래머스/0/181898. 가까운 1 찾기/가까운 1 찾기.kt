class Solution {
    fun solution(arr: IntArray, idx: Int): Int = arr.slice(idx until arr.size).indexOf(1).let{
        if (it == -1) -1 else it + idx
    }
}