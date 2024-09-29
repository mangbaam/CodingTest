import java.util.TreeMap

fun main(args: Array<String>) {
    val (_, _) = readln().split(" ").map { it.toInt() }
    val gifts = readln().split(" ").map { it.toInt() }.sortedDescending()
    val boxes = readln().split(" ").map { it.toInt() }
    val taken = readln().split(" ").map { it.toInt() }

    val boxCounts = TreeMap<Int, Int>().apply {
        for (box in boxes) put(box, getOrDefault(box, 0) + 1)
    }
    // 선택된 상자 제거
    taken.forEach { box ->
        boxCounts[box] = boxCounts.getOrDefault(box, 1) - 1
        if (boxCounts[box] == 0) boxCounts.remove(box)
    }

    val maxBox = if (boxCounts.isNotEmpty()) boxCounts.lastKey() else null
    if (maxBox == null) {
        println(0)
        return
    }

    println(gifts.firstOrNull { it <= maxBox } ?: 0)
}