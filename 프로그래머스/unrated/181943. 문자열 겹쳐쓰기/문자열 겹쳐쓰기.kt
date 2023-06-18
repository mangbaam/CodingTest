class Solution {
    fun solution(myString: String, overwriteString: String, s: Int): String {
        return myString.substring(0, s) + overwriteString + myString.substring(s + overwriteString.length, myString.length)
    }
}