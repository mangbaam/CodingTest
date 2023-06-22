class Solution {
    fun solution(strArr: Array<String>): Array<String> = strArr.toList().filterNot { "ad" in it }.toTypedArray()
}