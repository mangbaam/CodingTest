fun main(args: Array<String>) {
    // 0: 빈칸, 1: 벽, 2: 바이러스
    // 무조건 3개의 벽을 세워야 함
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = Array(n) { IntArray(m) }
    val viruses = mutableListOf<Pair<Int, Int>>()
    val walls = mutableListOf<Pair<Int, Int>>()
    var answer = 0
    repeat(n) { r ->
        map[r] = readln().split(" ").map { it.toInt() }.toIntArray().also { row ->
            row.indices.forEach { i ->
                when (row[i]) {
                    0 -> walls.add(r to i)
                    2 -> viruses.add(r to i)
                }
            }
        }
    }

    val dx = listOf(-1, 0, 1, 0)
    val dy = listOf(0, 1, 0, -1)
    var visited = Array(n) { BooleanArray(m) }

    fun dfs(x: Int, y: Int) {
        for (i in 0 until 4) {
            val nx = x + dx[i]
            val ny = y + dy[i]
            if (nx !in 0 until m || ny !in 0 until n) continue
            if (visited[ny][nx] || map[ny][nx] == 1) continue
            visited[ny][nx] = true
            dfs(nx, ny)
        }
    }

    fun solve(): Int {
        var count = 0
        visited = Array(n) { BooleanArray(m) }

        viruses.forEach { v ->
            visited[v.first][v.second] = true
            dfs(v.second, v.first)
        }

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (map[i][j] == 0 && !visited[i][j]) count++
            }
        }
        return count
    }

    // 1. 벽을 세운다
    for (i in walls.indices) {
        for (j in 0 until i) {
            for (k in 0 until j) {
                map[walls[i].first][walls[i].second] = 1
                map[walls[j].first][walls[j].second] = 1
                map[walls[k].first][walls[k].second] = 1
                answer = maxOf(answer, solve())
                map[walls[i].first][walls[i].second] = 0
                map[walls[j].first][walls[j].second] = 0
                map[walls[k].first][walls[k].second] = 0
            }
        }
    }
    println(answer)
}