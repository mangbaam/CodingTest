class Solution {
    data class Process(val index: Int, val priority: Int)
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        val queue = ArrayDeque<Process>().apply { addAll(priorities.mapIndexed { index, p -> Process(index, p) }) }
        val sortedQueue = ArrayDeque<Int>().apply { addAll(priorities.sortedDescending()) }
        while (queue.isNotEmpty()) {
            val now = queue.removeFirst()
            if (now.priority == sortedQueue.first()) {
                sortedQueue.removeFirst()
                answer++
                if (now.index == location) return answer
            } else {
                queue.add(now)
            }
        }
        return -1
    }
}