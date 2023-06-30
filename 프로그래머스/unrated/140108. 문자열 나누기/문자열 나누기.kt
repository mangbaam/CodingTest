class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var i = 0
        var (xCount, otherCount) = listOf(0, 0)
        
        while (i < s.length) {
            val x = s[i] // x 설정
            var j = i + 1 // x 다음 인덱스부터 탐색
            xCount = 1; otherCount = 0 // 개수 초기화
            while (j < s.length) {
                if (x == s[j]) xCount++ else otherCount++ // 개수 세기
                if (xCount == otherCount) { // 개수 같아진 경우
                    answer++ // 개수 추가
                    i = j + 1 // i를 j 다음 인덱스로 설정
                    break
                }
                j++
            }
            if (j >= s.length) break
        }
        if (xCount != otherCount) answer++
        
        return answer
    }
}