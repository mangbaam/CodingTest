class Solution {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        return genres
            .asSequence()
            .mapIndexed { index, genre ->
                Triple(index, genre, plays[index])
            }
            .groupBy { it.second }
            .entries
            .sortedByDescending { it.value.sumOf { it.third } }
            .flatMap {
                it.value.sortedWith(compareBy({ -it.third }, { it.first })).take(minOf(2, it.value.size))
            }
            .map { it.first }
            .toIntArray()
    }
}