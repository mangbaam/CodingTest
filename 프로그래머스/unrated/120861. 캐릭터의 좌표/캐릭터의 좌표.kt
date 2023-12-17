class Solution {

    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        val maxX = board[0] / 2
        val minX = -maxX
        val maxY = board[1] / 2
        val minY = -maxY
        
        val current = intArrayOf(0, 0)

        keyinput.forEach {
            when (it) {
                "left" -> current[0] = current[0].minus(1).coerceAtLeast(minX)
                "right" -> current[0] = current[0].plus(1).coerceAtMost(maxX)
                "up" -> current[1] = current[1].plus(1).coerceAtMost(maxY)
                else -> current[1] = current[1].minus(1).coerceAtLeast(minY)
            }
        }

        return current
    }
}