import java.math.BigInteger

fun main(args: Array<String>) {
    val numbers = mutableListOf<BigInteger>()
    repeat(readln().toInt()) {
        val sb = StringBuilder()
        readln().forEach { c ->
            if (c.isDigit()) {
                sb.append(c)
            } else {
                if (sb.isNotEmpty()) sb.toBigIntegerOrNull()?.let { numbers.add(it) }
                sb.clear()
            }
        }
        if (sb.isNotEmpty()) sb.toBigIntegerOrNull()?.let { numbers.add(it) }
    }
    numbers.sorted().forEach { println(it) }
}

private fun StringBuilder.toBigIntegerOrNull(): BigInteger? {
    return toString().toBigIntegerOrNull()
}