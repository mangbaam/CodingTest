class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        
        fun moveOrNull(current: Pair<Int, Int>, route: String): Pair<Int, Int>? {
            val (d, s) = route.split(" ")
            var nextPos = current
            repeat(s.toInt()) {
                nextPos = when (d) {
                    "E" -> Pair(nextPos.first, nextPos.second + 1)  // 동
                    "W" -> Pair(nextPos.first, nextPos.second - 1) // 서
                    "S" -> Pair(nextPos.first + 1, nextPos.second) // 남
                    else -> Pair(nextPos.first - 1, nextPos.second) // 북
                }
                // valid check
                if (
                    nextPos.first !in 0 until park.size ||
                    nextPos.second !in 0 until park.first().length ||
                    park[nextPos.first][nextPos.second] == 'X'
                ) {
                    return null
                }
            }

            return nextPos
        }
        
        // Start 찾기
        var pos = Pair(0, 0)
        park.forEachIndexed { i, row ->
            if ('S' in row) pos = Pair(i, row.indexOf('S'))
        }
        
        routes.forEach { route ->
            moveOrNull(pos, route)?.let { pos = it }
        }
        
        return intArrayOf(pos.first, pos.second)
    }
}