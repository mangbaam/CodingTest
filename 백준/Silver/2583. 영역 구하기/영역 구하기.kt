fun main(args: Array<String>) {
    val (n, m, k) = readln().split(" ").map { it.toInt() }
    val areas = mutableListOf<Int>()
    val map = Array(n) { IntArray(m) }
    repeat(k) {
        val (lx, ly, rx, ry) = readln().split(" ").map { it.toInt() }
        for (row in (n - ry) until (n - ly)) {
            for (col in lx until rx) {
                map[row][col] = 1
            }
        }
    }

    val dx = listOf(1, 0, -1, 0)
    val dy = listOf(0, 1, 0, -1)
    fun dfs(y: Int, x: Int): Int {
        var count = 1
        map[y][x] = 1
        repeat(4) {
            val nx = x + dx[it]
            val ny = y + dy[it]
            if (nx !in 0 until m || ny !in 0 until n) return@repeat
            if (map[ny][nx] == 0) {
                count += dfs(ny, nx)
            }
        }
        return count
    }

    repeat(n) { row ->
        repeat(m) { col ->
            if (map[row][col] == 0) {
                areas.add(dfs(row, col))
            }
        }
    }

    println(areas.size)
    areas.sorted().forEach { print("$it ") }
}