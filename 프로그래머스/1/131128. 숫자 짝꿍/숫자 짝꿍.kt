class Solution {
    fun solution(X: String, Y: String): String {
        val x = X.toSet()
        val y = Y.toSet()
        val inter = x.intersect(y)

        return buildList<Char> { 
            inter.forEach {  num ->
                repeat(minOf(X.count { it == num }, Y.count { it == num })) {
                    add(num)
                }
            }
        }.sortedDescending().joinToString("").let { if (it.isEmpty()) "-1" else it }.trimStart('0').let { if (it.isEmpty()) "0" else it }
    }
}