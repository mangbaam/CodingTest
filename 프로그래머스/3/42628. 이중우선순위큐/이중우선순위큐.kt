import java.util.PriorityQueue

class Solution {
    fun solution(operations: Array<String>): IntArray {
        val queue = PriorityQueue<Int>()
        operations.forEach { operation ->
            val op = operation.first()
            val num = operation.slice(2..operation.lastIndex).toIntOrNull() ?: 0
            when (op) {
                'I' -> queue.offer(num)
                'D' -> if (num == 1) {
                    queue.maxOrNull()?.let { queue.remove(it) }
                } else {
                    queue.poll()
                }
            }
        }
        return intArrayOf(queue.maxOrNull() ?: 0, queue.minOrNull() ?: 0)
    }
}