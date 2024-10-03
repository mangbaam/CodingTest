class Solution {
    fun isDiffOneChar(s1: String, s2: String): Boolean =
        s1.length == s2.length && (0..s1.lastIndex).count { s1[it] != s2[it] } == 1

    fun solution(begin: String, target: String, words: Array<String>): Int {
        var answer: Int? = null

        val graph = buildMap<String, List<String>> {
            words.forEach { word ->
                put(word, words.filter { isDiffOneChar(word, it) })
            }
            put(begin, words.filter { isDiffOneChar(begin, it) })
        }
        val visited = words.associateWith { false }.toMutableMap()
        val queue =ArrayDeque<Pair<String, Int>>().apply { add(begin to 0) }
        while (queue.isNotEmpty()) {
            val (word, count) = queue.removeFirst()
            if (word == target) {
                answer = minOf(answer ?: Int.MAX_VALUE, count)
            }

            graph[word]?.forEach { w ->
                if (visited.contains(w) && !visited[w]!!){
                    queue.add(w to count + 1)
                    visited[w] = true
                }
            }
        }

        return answer ?: 0
    }
}