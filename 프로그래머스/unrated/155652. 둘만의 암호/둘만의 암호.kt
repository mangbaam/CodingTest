class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val dict = hashMapOf<Char, Char>()

        fun encrypt(c: Char): Char {
            return dict[c] ?: run {
                var tmp = c
                var i = 0
                while (i < index) {
                    tmp = ((tmp - 'a' + 27) % 26 + 'a'.code).toChar()
                    if (tmp !in skip) i++
                }
                while (tmp > 'z') tmp -= 26
                dict.getOrPut(c) { tmp }
            }
        }
        return s.map(::encrypt).joinToString("")
    }
}