class Solution {
    fun solution(num_list: IntArray): IntArray {
        return num_list.run {
            if (last() > get(lastIndex - 1)) plus(last() - get(lastIndex - 1)) else plus(last() * 2)
        }
    }
}