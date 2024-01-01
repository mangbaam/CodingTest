class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val alphaMap = mutableMapOf<Char, Int>()
        keymap.forEach { key ->
            key.forEachIndexed { i, c -> 
                if (alphaMap.containsKey(c)) {
                    alphaMap.put(c, minOf(alphaMap[c]!!, i + 1))
                } else {
                    alphaMap.put(c, i + 1)
                }
            }
        }

        return targets.map { target ->
            target.map { 
                alphaMap.getOrDefault(it, -1)
            }.let {
                if (it.any { it == -1 }) -1 else it.sum()
            }
        }.toIntArray()
    }
}