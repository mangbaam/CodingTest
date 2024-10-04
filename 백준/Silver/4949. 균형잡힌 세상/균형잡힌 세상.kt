fun main(args: Array<String>) {
    while (true) {
        val s = readln().also { if (it == ".") return }
        val stack = ArrayDeque<Char>()
        s.forEach { c->
            when (c) {
                '(', '[' -> stack.add(c)
                ')' -> if (stack.lastOrNull() == '(') stack.removeLast() else stack.add(c)
                ']' -> if (stack.lastOrNull() == '[') stack.removeLast() else stack.add(c)
            }
        }
        println(if (stack.isEmpty()) "yes" else "no")
    }
}