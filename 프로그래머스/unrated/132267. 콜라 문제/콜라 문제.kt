class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer = 0
        var bottles = n

        while (bottles >= a) {
            val newBottles = (bottles / a) * b
            answer += newBottles
            bottles = newBottles + bottles % a
        }

        return answer
    }
}