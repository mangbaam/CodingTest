import java.util.StringTokenizer
import kotlin.collections.ArrayList

data class Load(val weight: Int, val nodeV: Int, val nodeU: Int)

fun solution6497() = with(System.`in`.bufferedReader()) {
    lateinit var st: StringTokenizer
    lateinit var rank: HashMap<Int, Int>
    lateinit var parent: HashMap<Int, Int>

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

    while (true) {
        st = StringTokenizer(readLine(), " ")
        val houses = Integer.parseInt(st.nextToken())
        val loads = Integer.parseInt(st.nextToken())

        if (houses == 0 && loads == 0) break

        rank = HashMap()
        parent = HashMap()

        var total = 0

        for (i in 0 until houses) {
            rank[i] = 0
            parent[i] = i
        }

        val edges = ArrayList<Load>().apply {
            repeat(loads) {
                st = StringTokenizer(readLine(), " ")
                val v = Integer.parseInt(st.nextToken())
                val u = Integer.parseInt(st.nextToken())
                val m = Integer.parseInt(st.nextToken())
                add(Load(m, v, u))
                total += m
            }
        }

        var save = 0

        edges.sortedBy { it.weight }.forEach {
            if (find(it.nodeV) != find(it.nodeU)) {
                union(it.nodeV, it.nodeU)
                save += it.weight
            }
        }
        println(total - save)
    }
}

fun main() {
    solution6497()
}