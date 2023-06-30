class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val playerMap = hashMapOf<String, Int>()
        val indexMap = hashMapOf<Int, String>()

        fun transcendence(player: String) { // 추월
            val current: Int = playerMap.getValue(player)
            val prevPlayer: String = indexMap.getValue(current - 1)
            // 추월
            indexMap.put(current - 1, player)
            playerMap.put(player, playerMap.getValue(player) - 1)
            // 밀림
            indexMap.put(current, prevPlayer)
            playerMap.put(prevPlayer, playerMap.getValue(prevPlayer) + 1)
        }
        
        // init
        players.forEachIndexed { i, player ->
            playerMap[player] = i
            indexMap[i] = player
        }

        callings.forEach { name ->
            transcendence(name)
        }
        
        val result = mutableListOf<String>()
        repeat(players.size) {
            result.add(indexMap.getValue(it))
        }
        return result.toTypedArray()
    }
}