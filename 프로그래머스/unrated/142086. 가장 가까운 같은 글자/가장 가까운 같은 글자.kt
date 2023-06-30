class Solution {
    fun solution(s: String): IntArray {
        val answer = mutableListOf<Int>()
        val stack = arrayListOf<Char>()
        s.forEach { c ->
            if (stack.isEmpty()) {
                answer.add(-1)
            } else {
                answer.add(
                    stack.indexOfLast { it == c }.let { i ->
                        if (i > -1) stack.size - i else i
                    }
                )
            }
            stack.add(c)
        }
        return answer.toIntArray()
    }
}