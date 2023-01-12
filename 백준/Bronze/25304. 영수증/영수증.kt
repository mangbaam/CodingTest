fun main() {
    val total = readln().toInt()
    var sum = 0
    repeat(readln().toInt()) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        sum += a * b
    }
    if (total == sum) println("Yes") else println("No")
}
