fun main(args: Array<String>) {
    val (n, c) = readln().split(" ").map { it.toInt() }
    val message = readln().split(" ").map { it.toInt() }
    val messageSet = message.toSet()
    val messageMap = buildMap<Int, Int> {
        message.forEach { n -> put(n, getOrDefault(n, 0) + 1) }
    }.toList().sortedWith(compareBy({ -it.second }, { messageSet.indexOf(it.first) }))
    messageMap.forEach { (k, v) ->
        repeat(v) { print("$k ") }
    }
}