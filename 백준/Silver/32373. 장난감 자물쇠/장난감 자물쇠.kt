fun main(args: Array<String>) {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val arr = readln().split(" ").map { it.toInt() }.toMutableList()

    for (i in 0 until k) {
        val mods = mutableListOf<Int>()
        var j = i
        while (j < n) {
            mods.add(arr[j])
            j += k
        }
        mods.sort()
        j = i
        var idx = 0
        while (j < n) {
            arr[j] = mods[idx]
            j += k
            idx++
        }
    }

    val sorted = arr.toList() == (0 until n).toList()
    println(if (sorted) "Yes" else "No")
}