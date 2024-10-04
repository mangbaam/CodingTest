fun main(args: Array<String>) {
    repeat(readln().toInt()) {
        val stack = ArrayDeque<Char>()
        readln().forEach { c ->
            when (c) {
                '(' -> stack.add(c)
                ')' -> if (stack.isNotEmpty() && stack.last() == '(') stack.removeLast() else stack.add(c)
            }
        }
        println(if (stack.isEmpty()) "YES" else "NO")
    }
}