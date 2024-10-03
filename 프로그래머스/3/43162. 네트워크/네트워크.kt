class Solution {
    
    fun bfs(graph: List<List<Int>>, start: Int, visited: BooleanArray): Int {
        if (visited[start]) return 0
        val queue = ArrayDeque<Int>().apply { add(start) }
        while (queue.isNotEmpty()) {
            val v = queue.removeFirst()
            graph[v].forEach {
                if (!visited[it]) {
                    queue.add(it)
                    visited[it] = true
                }
            }
        }
        return 1
    }
    
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        
        val graph: List<List<Int>> = buildList {
            repeat(n) { row -> (0 until n).filter { computers[row][it] == 1 }.let { add(it) } }
        }
        val visited = BooleanArray(n) { false }
        repeat(n) { answer += bfs(graph, it, visited) }
        
        return answer
    }
}