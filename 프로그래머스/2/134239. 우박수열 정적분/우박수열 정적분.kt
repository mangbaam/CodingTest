import kotlin.math.absoluteValue

class Solution {
    fun Int.callatz(): List<Int> = buildList {
        var n = this@callatz
        add(n)
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2
            } else {
                n = (n * 3) + 1
            }
            add(n)
        }
    }

    fun List<Int>.toDefiniteIntegral(): List<Double> = buildList {
        if (this@toDefiniteIntegral.isEmpty()) return@buildList
        for (i in 1..this@toDefiniteIntegral.lastIndex) {
            val a = this@toDefiniteIntegral.get(i - 1)
            val b = this@toDefiniteIntegral.get(i)
            add((a - b).absoluteValue.toDouble() / 2 + minOf(a, b))
        }
    }

    fun List<Double>.prefixSum(): List<Double> = fold(mutableListOf<Double>(0.0)) { acc, d ->
        acc.apply { add(acc.last() + d) }
    }

    fun solution(k: Int, ranges: Array<IntArray>): DoubleArray {
        var answer: DoubleArray = DoubleArray(ranges.size)
        val callatz = k.callatz()

        ranges.forEachIndexed { i, (s, e) ->
            if (s > callatz.lastIndex + e) {
                answer[i] = -1.0
            } else {
                val prefixSum = callatz.toDefiniteIntegral().prefixSum()
                answer[i] = prefixSum[callatz.lastIndex + e] - prefixSum[s]
            }
        }

        return answer
    }
}