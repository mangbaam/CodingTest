class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        val locations = mutableListOf<Pair<Int, Int>>()
        for (i in 0 until wallpaper.size) {
            for (j in 0 until wallpaper.first().length) {
                if (wallpaper[i][j] == '#') locations.add(Pair(i, j))
            }
        }
        return intArrayOf(
            locations.sortedWith(compareBy({ it.first }, { it.second })).first().first,
            locations.sortedWith(compareBy({ it.second }, { it.first })).first().second,
            locations.sortedWith(compareBy({ -it.first }, { -it.second })).first().first + 1,
            locations.sortedWith(compareBy({ -it.second }, { -it.first })).first().second + 1,
        )
    }
}