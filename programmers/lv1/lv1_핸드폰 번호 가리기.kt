package programmers.lv1

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12948?language=kotlin
 * */

class Solution12948 {
    fun solution(phone_number: String) =
        "*".repeat(phone_number.length - 4) + phone_number.substring(phone_number.length - 4)
}