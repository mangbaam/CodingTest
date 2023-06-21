class Solution {
    fun solution(cipher: String, code: Int): String {
        return cipher.filterIndexed { i, c -> (i + 1) % code == 0 }.toString()
    }
}