data class Bridge(val cost: Int, val nodeV: Int, val nodeU: Int)

class Solution {
    fun solution(n: Int, costs: Array<IntArray>): Int {
        val parent = HashMap<Int, Int>()
        val rank = HashMap<Int, Int>()
        var answer = 0

        fun find(node: Int): Int {
            if (parent[node] != node) {
                parent[node] = find(parent[node]!!)
            }
            return parent[node]!!
        }

        fun union(nodeV: Int, nodeU: Int) {
            val root1 = find(nodeV)
            val root2 = find(nodeU)
            if (rank[root1]!! > rank[root2]!!) {
                parent[root2] = root1
            } else {
                parent[root1] = root2
                if (rank[root1] == rank[root2]) {
                    rank[root2] = rank[root2]!! + 1
                }
            }
        }

        (0..n).forEach {
            parent[it] = it
            rank[it] = 0
        }

        costs.map { (a, b, c) ->
            Bridge(c, a, b)
        }.sortedBy {
            it.cost
        }.forEach {
            if (find(it.nodeV) != find(it.nodeU)) {
                union(it.nodeV, it.nodeU)
                answer += it.cost
            }
        }
        return answer
    }
}