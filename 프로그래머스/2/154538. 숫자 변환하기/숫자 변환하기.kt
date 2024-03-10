class Solution {
    fun solution(x: Int, y: Int, n: Int): Int {
        var answer: Int = 0
        var s = setOf(x)
        while (s.isNotEmpty()) {
            if (s.contains(y)) return answer
            val ns = mutableSetOf<Int>()
            s.forEach {
                if (it + n <= y) ns.add(it + n)
                if (it * 2 <= y) ns.add(it * 2)
                if (it * 3 <= y) ns.add(it * 3)
            }
            answer++
            s = ns
        }

        return -1
    }
}