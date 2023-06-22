class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer = mutableListOf<Int>()
        arr.indices.forEach { i ->
            if (flag[i]) {
                repeat(arr[i] * 2) {
                    answer.add(arr[i])
                }
            } else {
                repeat(arr[i]) {
                    answer.removeLast()    
                }
            }
        }
        return answer.toIntArray()
    }
}