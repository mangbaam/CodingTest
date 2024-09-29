fun main(args: Array<String>) {
    val (n, good, bad) = readln().split(" ").map { it.toInt() }.toList()
    var goodOnion = 1
    var badOnion = 1

    fun swap() {
        goodOnion = badOnion.also { badOnion = goodOnion }
    }

    repeat(n) {
        goodOnion += good
        badOnion += bad
        if (goodOnion < badOnion) swap()
        if (goodOnion == badOnion) badOnion--
    }

    print("$goodOnion $badOnion")
}