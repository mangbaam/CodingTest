/**
 * https://programmers.co.kr/learn/courses/30/lessons/92334
 * */

class Solution92334 {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {

        val history = id_list.map { it to mutableSetOf<String>() }.toMap()

        // history = 신고 당한 유저 to [신고 한 유저 목록]
        for (info in report) {
            val (reportFrom, reportTo) = info.split(" ")
            history[reportTo]?.add(reportFrom)
        }
        // history에서 k번 이상 신고 당한 유저
        val banned = history.filterValues { it.size >= k }
        val reporter: MutableMap<String, Int> = id_list.map { it to 0 }.toMap().toMutableMap()

        // reporter = 정지 된 유저를 신고한 횟수 세기
        banned.forEach { (k, v) ->
            v.forEach {
                reporter.plusAssign(it to reporter[it]!! + 1)
            }
        }

        // 신고 횟수만 저장
        return reporter.values.toIntArray()
    }
}