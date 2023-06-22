class Solution {
    fun solution(myStr: String): Array<String> = myStr.split("[a,b,c]".toRegex()).filter(String::isNotBlank).toTypedArray()?.let {
        if (it.isEmpty()) arrayOf("EMPTY") else it
    }
}