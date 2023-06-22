class Solution {
    fun solution(code: String): String {
        var mode = 0
        val ret = StringBuilder()
        code.forEachIndexed { i, c ->
            when (c) {
                '1' -> mode = (mode + 1) % 2 // 모드 변경
                else -> {
                    when (mode) {
                        0 -> if (i % 2 == 0) ret.append(c)
                        else -> if (i % 2 == 1) ret.append(c)
                    }
                }
            }
        }
        return ret.toString().run {
            if (isNotEmpty()) this else "EMPTY"
        }
    }
}