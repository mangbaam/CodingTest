package Silver

/**
 * https://www.acmicpc.net/problem/2422
 * 2422_한윤정이 이탈리아에 가서 아이스크림을 사먹는데 (S5)
 * */
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { Integer.parseInt(it) }
    val d = MutableList(n + 1) {
        MutableList(n + 1) { false }
    }

    for (i in 1..m) {
        val (a, b) = readLine().split(" ").map { Integer.parseInt(it) }
        d[a][b] = true
        d[b][a] = true
    }

    var answer = 0
    for (i in 1..n) {
        for (j in i + 1..n) {
            for (k in j+1..n) {
                if (d[i][j] || d[i][k] || d[j][k]) continue
                answer++
            }
        }
    }

    print(answer)
}