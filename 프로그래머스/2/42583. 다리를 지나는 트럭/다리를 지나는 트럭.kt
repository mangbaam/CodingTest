import java.util.LinkedList

class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0

        var currentWeight = 0
        val waitingQueue = ArrayDeque<Int>().apply { addAll(truck_weights.toList()) }
        val onBridgeQueue = LinkedList<Int>().apply { repeat(bridge_length) { add(0) } }

        fun next(weight: Int) {
            currentWeight -= onBridgeQueue.removeFirst()
            currentWeight += weight
            onBridgeQueue.addLast(weight)
        }

        while (waitingQueue.isNotEmpty() || currentWeight > 0) {
            if (waitingQueue.isNotEmpty() && currentWeight + waitingQueue.first() - onBridgeQueue.first() <= weight) {
                next(waitingQueue.removeFirst())
            } else {
                next(0)
            }
            answer++
        }

        return answer
    }
}