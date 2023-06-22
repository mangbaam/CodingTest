class Solution {
    fun solution(names: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        names.forEachIndexed { i, name -> 
            if (i % 5 == 0) answer += name
        }
        return answer
    }
}