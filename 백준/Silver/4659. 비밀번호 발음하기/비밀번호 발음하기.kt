fun main(args: Array<String>) {
    var word = readln()
    val moum = listOf('a', 'e', 'i', 'o', 'u')
    val jaum = ('a'..'z').filterNot { it in moum }
    while (word != "end") {
        var hasMoum = false
        var moumOverflow = false
        var jaumOverflow = false
        var repeatTwice = false
        word.forEachIndexed { i, c ->
            if (c in moum) hasMoum = true // 1번. 모음 하나 반드시 포함
            if (i >= 2) { // 2번. 모음 혹은 자음 3개 연속 불가
                val subWord = listOf(word[i - 2], word[i - 1], word[i])
                when {
                    subWord.all { it in moum } -> {
                        moumOverflow = true
                        return@forEachIndexed
                    }

                    subWord.all { it in jaum } -> {
                        jaumOverflow = true
                        return@forEachIndexed
                    }
                }
            }
            if (i > 0 && word[i - 1] == word[i] && c != 'e' && c != 'o') {
                // 3번. 같은 글자가 연속으로 두 번 등장
                repeatTwice = true
                return@forEachIndexed
            }
        }
        val valid = hasMoum && !jaumOverflow && !moumOverflow && !repeatTwice
        printAcceptable(word, valid)
        word = readln()
    }
}

private fun printAcceptable(word: String, valid: Boolean) {
    println("<${word}> is${if (!valid) " not" else ""} acceptable.")
}