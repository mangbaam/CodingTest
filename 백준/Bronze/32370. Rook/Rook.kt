import java.util.*

fun main(args: Array<String>) {
    val pawnA = readln().split(" ").map { it.toLong() }.let { Pair(it[0], it[1]) }
    val pawnB = readln().split(" ").map { it.toLong() }.let { Pair(it[0], it[1]) }
    when {
        pawnA.first == 0L -> if (pawnB.first == 0L && pawnB.second < pawnA.second) 3 else 1
        pawnA.second == 0L -> if (pawnB.second == 0L && pawnB.first < pawnA.first) 3 else 1
        else -> 2
    }.also(::println)
}