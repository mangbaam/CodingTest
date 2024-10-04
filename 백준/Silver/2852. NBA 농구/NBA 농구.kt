fun main(args: Array<String>) {
    val winTimes = IntArray(3) // 이기고 있는 시간들
    val goals = IntArray(3) // 골 개수
    var lastTime: Int = 0 // 마지막 득점 시간

    // 전체 경기는 00:00 ~ 47:59
    repeat(readln().toInt()) {
        val (t, time) = readln().split(" ")
        val team = t.toInt()
        val seconds = time.timeToSeconds() // 득점 시간
        val otherTeam = if (team == 2) 1 else 2
        when {
            goals[team] > goals[otherTeam] -> { // 원래 이기고 있었을 때
                winTimes[team] += seconds - lastTime
            }
            goals[team] == goals[otherTeam] -> Unit // 비기고 있었을 때
            goals[team] == goals[otherTeam] - 1 -> { // 이번 득점으로 동점이 됐을 때
                winTimes[otherTeam] += seconds - lastTime
            }
            goals[team] < goals[otherTeam] -> { // 원래 지고 있었을 때
                winTimes[otherTeam] += seconds - lastTime
            }
        }
        goals[team]++ // 골 처리
        lastTime = seconds // 마지막 골 넣은 시간 기록
    }
    val extra = "48:00".timeToSeconds() - lastTime
    when {
        goals[1] > goals[2] -> winTimes[1] += extra
        goals[1] < goals[2] -> winTimes[2] += extra
    }

    winTimes.drop(1).forEach { println(it.secondsToTime()) }
}

private fun String.timeToSeconds(): Int = split(":").let { it.first().toInt() * 60 + it[1].toInt() }

private fun Int.secondsToTime(): String {
    val minutes = div(60)
    val seconds = mod(60)
    val minStr = minutes.toString().padStart(2, '0')
    val secStr = seconds.toString().padStart(2, '0')
    return "$minStr:$secStr"
}