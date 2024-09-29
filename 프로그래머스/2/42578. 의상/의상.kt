class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        return clothes
            .groupBy { it[1] }
            .map { it.value.size + 1 }
            .reduce { acc, i -> acc * i } - 1
    }
}