fun main(args: Array<String>) {
    val nums = hashSetOf<Int>()
    var n = 666
    while (nums.size < 10000) {
        if ("666" in n.toString()) nums.add(n)
        n++
    }
    println(nums.sorted()[readln().toInt() - 1])
}