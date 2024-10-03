import kotlin.math.absoluteValue

fun main(args: Array<String>) {
    val (n, m) = readln().split(" ").map { it.toInt() }
    var left = 0
    fun right() = left + m - 1
    var count = 0
    repeat(readln().toInt()) {
        val apple = readln().toInt() - 1
        when {
            apple < 0 || apple >= n -> Unit
            apple < left -> {
                count += (left - apple).absoluteValue
                left = apple
            }
            apple > right() -> {
                count += (apple - right()).absoluteValue
                left += (apple - right())
            }
        }
    }

    println(count)
}