class Solution {
    fun solution(hp: Int): Int {
        var hp = hp
        var answer: Int = 0
        while (hp > 0) {
            when {
                hp >= 5 -> {
                    answer += hp / 5
                    hp %= 5
                }
                hp >= 3 -> {
                    answer += hp / 3
                    hp %= 3
                }
                else -> {
                    answer += hp
                    hp = 0
                }
            }
        }
        return answer
    }
}