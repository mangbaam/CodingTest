fun main(args: Array<String>) {
    val keyboard = buildList {
        repeat(4) { add(readln().toList()) }
    }
    val punch = readln().toHashSet()
    var x = Int.MAX_VALUE
    var y = Int.MAX_VALUE

    keyboard.forEachIndexed { index, chars ->
        chars.indexOfFirst { it in punch }.let {
            if (it != -1 && index <= y && it <= x) {
                y = index
                x = it
            }
        }
    }
    val pointX = (x + 1).coerceIn(0, 9)
    val pointY = (y + 1).coerceIn(0, 3)
    println(keyboard[pointY][pointX])
}