class Solution {
    fun solution(num: Int, k: Int) = num.toString().indexOf(k.toString()).let {
        if (it > -1) it + 1 else it
    }
}