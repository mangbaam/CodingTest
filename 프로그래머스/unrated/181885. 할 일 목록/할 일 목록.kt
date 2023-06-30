class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray) = todo_list.filterIndexed { i, _ ->
        !finished[i]
    }
}