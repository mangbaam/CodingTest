import java.util.*

fun solution1614() = with(System.`in`.bufferedReader()) {
    var st = StringTokenizer(readLine(), " ")

    val n = Integer.parseInt(st.nextToken())
    val k = Integer.parseInt(st.nextToken())

    val graph = Array(n + 1) { BooleanArray(n + 1) }

    repeat(k) {
        st = StringTokenizer(readLine(), " ")
        val a = Integer.parseInt(st.nextToken())
        val b = Integer.parseInt(st.nextToken())
        graph[a][b] = true
    }

    for (x in 1..n) {
        for (a in 1..n) {
            for (b in 1..n) {
                if (graph[a][x] && graph[x][b])
                    graph[a][b] = true
            }
        }
    }

    val sb = StringBuilder()
    repeat(Integer.parseInt(readLine())) {
        st = StringTokenizer(readLine(), " ")
        val a = Integer.parseInt(st.nextToken())
        val b = Integer.parseInt(st.nextToken())
        when {
            graph[a][b] -> sb.appendLine("-1")
            graph[b][a] -> sb.appendLine("1")
            else -> sb.appendLine("0")
        }
    }
    println(sb.toString())
}

fun main() {
    solution1614()
}