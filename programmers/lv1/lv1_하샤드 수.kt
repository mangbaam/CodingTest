package programmers.lv1

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12947
 * */

class Solution12947 {
    fun solution(x: Int): Boolean {
//        return x % x.toString().fold(0) { acc, c -> acc + c.toString().toInt() } == 0
        var total = 0
        x.toString().forEach {
            total += Integer.parseInt(it.toString())
        }
        return x.rem(total)==0
    }
}