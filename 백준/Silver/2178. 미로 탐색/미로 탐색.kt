fun main(args: Array<String>) {
    val dx = listOf(0, 1, 0, -1)
    val dy = listOf(1, 0, -1, 0)
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = Array(n) { IntArray(m) }
    repeat(n) {
        readln().forEachIndexed { index, c -> map[it][index] = c.digitToIntOrNull() ?: 0 }
    }
    val visited = Array(n) { IntArray(m) }
    val queue = ArrayDeque<Pair<Int, Int>>().apply { add(0 to 0) }
    visited[0][0] = 1
    while (queue.isNotEmpty()) {
        val (cy, cx) = queue.removeFirst()
        if (cy == n - 1 && cx == m - 1) {
            println(visited[cy][cx])
            break
        }
        repeat(4) {
            val nx = dx[it] + cx
            val ny = dy[it] + cy
            if (nx in 0 until m && ny in 0 until n && visited[ny][nx] == 0 && map[ny][nx] == 1) {
                visited[ny][nx] = visited[cy][cx] + 1
                queue.add(ny to nx)
            }
        }
    }
}