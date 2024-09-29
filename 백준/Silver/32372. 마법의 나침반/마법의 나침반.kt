fun main(args: Array<String>) {
    val (n, m) = readln().split(" ").map { it.toInt() }
    var (minX, minY, maxX, maxY) = listOf(1, 1, n, n)
    var (pointX, pointY) = listOf<Int?>(null, null) // 찾은 경우 non null

    repeat(m) {
        val (x, y, direction) = readln().split(" ").map { it.toInt() }
        when (direction) {
            1 -> {
                maxX = pointX ?: minOf(x - 1, maxX)
                pointY = y
                minY = y
                maxY = y
            }

            2 -> {
                maxX = pointX ?: minOf(x - 1, maxX)
                minY = pointY ?: maxOf(y + 1, minY)
            }

            3 -> {
                minY= pointY ?: maxOf(y + 1, minY)
                pointX = x
                minX = x
                maxX = x
            }

            4 -> {
                minX = pointX ?: maxOf(x + 1, minX)
                minY = pointY ?: maxOf(y + 1, minY)
            }

            5 -> {
                minX = pointX ?: maxOf(x + 1, minX)
                pointY = y
                minY = y
                maxY = y
            }

            6 -> {
                minX = pointX ?: maxOf(x + 1, minX)
                maxY = pointY ?: minOf(y - 1, maxY)
            }

            7 -> {
                maxY = pointY ?: minOf(y - 1, minY)
                pointX = x
                minX = x
                maxX = x
            }

            8 -> {
                maxX = pointX ?: minOf(x - 1, maxX)
                maxY = pointY ?: minOf(y - 1, maxY)
            }
        }
        if (pointX != null && pointY != null) return@repeat
    }
    pointX = pointX ?: minX
    pointY = pointY ?: minY

    println("$pointX $pointY")
}