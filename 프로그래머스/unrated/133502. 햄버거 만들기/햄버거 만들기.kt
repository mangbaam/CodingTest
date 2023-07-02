class Solution {
    fun solution(ingredient: IntArray): Int {
        val stack = mutableListOf<Int>()
        var answer = 0
        ingredient.forEach { ing ->
            if (ing == 빵 && stack.size >= 3 && stack.takeLast(3) == listOf(빵, 야채, 고기)) {
                answer++
                repeat(3) { stack.removeLast() }
            } else {
                stack.add(ing)
            }
        }
        return answer
    }
}

const val 빵 = 1
const val 야채 = 2
const val 고기 = 3