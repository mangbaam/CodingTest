class Solution {
    fun dfs(numbers: IntArray, target: Int, idx: Int = 0, now: Int = 0): Int {
        var answer = 0
        if (idx == numbers.size) return if (now == target) 1 else 0
        
        answer += dfs(numbers, target, idx + 1, now + numbers[idx])
        answer += dfs(numbers, target, idx + 1, now - numbers[idx])
        
        return answer
    }
    
    fun solution(numbers: IntArray, target: Int): Int {
        return dfs(numbers, target)
    }
}