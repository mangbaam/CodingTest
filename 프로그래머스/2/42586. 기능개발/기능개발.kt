class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        var i = 0
        val queue = ArrayDeque<Int>().apply { addAll(progresses.toList()) }

        while (queue.isNotEmpty()) {
            var plusDays = 0
            while (queue.first() + speeds[i] * plusDays < 100) plusDays++
            val dropCount = queue
                .asSequence()
                .mapIndexed { index, progress -> progress + plusDays * speeds[index + i] }
                .takeWhile { it >= 100 }
                .count()
            repeat(dropCount) { queue.removeFirst() }
            i += dropCount
            answer.add(dropCount)
        }

        return answer.toIntArray()
    }
}