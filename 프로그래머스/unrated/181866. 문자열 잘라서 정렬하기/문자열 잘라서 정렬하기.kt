class Solution {
    fun solution(myString: String): Array<String> {
        return myString.split("x")
            .filter(String::isNotBlank)
            .sorted()
            .toTypedArray()
    }
}