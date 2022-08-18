class Solution {
    fun solution(n: Int, results: Array<IntArray>): Int {
        val graph = Array(n + 1) { BooleanArray(n + 1) }

    results.forEach { (a, b) ->
        graph[a][b] = true
    }

    for (k in 1..n) {
        for (x in 1..n) {
            for (y in 1..n) {
                if (graph[x][k] && graph[k][y]) {
                    graph[x][y] = true
                }
            }
        }
    }

    var count = 0
    var flag: Boolean
    graph.drop(1).forEachIndexed { i, it ->
        flag = true
        it.drop(1).forEachIndexed { j, b ->
            if (i != j && !(graph[i + 1][j + 1] xor graph[j + 1][i + 1])) flag = false
        }
        if (flag) count++
    }

    return count
    }
}