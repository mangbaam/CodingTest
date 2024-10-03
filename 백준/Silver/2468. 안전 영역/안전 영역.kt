fun main(args: Array<String>) {
    var answer = 0
    var maxHeight = 0
    val n = readln().toInt()
    val map = mutableListOf<List<Int>>()
    repeat(n) { map.add(readln().split(" ").map { it.toInt().also { maxHeight = maxOf(maxHeight, it) } }) }

    var visited = Array(n) { BooleanArray(n) }
    val dx = listOf(1, 0, -1, 0)
    val dy = listOf(0, 1, 0, -1)

    fun dfs(x: Int, y: Int, h: Int) {
        visited[y][x] = true
        repeat(4) { i ->
            val nx = x + dx[i]
            val ny = y + dy[i]
            if (nx !in 0 until n || ny !in 0 until n) return@repeat
            if (!visited[ny][nx] && map[ny][nx] >= h) {
                dfs(nx, ny, h)
            }
        }
    }

    (1 .. maxHeight).forEach { height ->
        var count = 0
        visited = Array(n) { BooleanArray(n) }
        repeat(n) { row ->
            repeat(n) { col ->
                if (map[row][col] >= height && !visited[row][col]) {
                    visited[row][col] = true
                    dfs(col, row, height)
                    count++
                }
            }
        }
        answer = maxOf(answer, count)
    }
    println(answer)
}