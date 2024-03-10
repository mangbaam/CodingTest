class Solution {
    fun solution(n: Int): Int = fibonacci(n)

    private fun fibonacci(n: Int): Int = fibonacciSeq.take(n + 1).last()
    
    private val fibonacciSeq: Sequence<Int> = sequence<Int> {
        var i = 0
        var j = 1
        yield(i)
        yield(j)
        while (true) {
            val n = (i + j) % 1234567
            yield(n)
            i = j
            j = n
        }
    }
}