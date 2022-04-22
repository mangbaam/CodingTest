package Silver

import java.util.Collections.max

/**
 * https://www.acmicpc.net/problem/1969
 * 1969_DNA (S5)
 * */

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { Integer.parseInt(it) }
    val dna = mutableListOf<String>()
    for (i in 1..n) {
        dna.add(readLine())
    }
    var answer = ""
    var hammingDistance = 0

    for(i in 0 until m) {
        val d = mutableMapOf("A" to 0, "C" to 0, "G" to 0, "T" to 0)
        for(c in 0 until n) {
            d[dna[c][i].toString()] = d[dna[c][i].toString()]!!.plus(1)
        }
        val maxCount = max(d.values)
        val selectedKey = d.keys.first { key -> d[key] == maxCount }
        answer += selectedKey
        hammingDistance += n - d[selectedKey]!!
    }
    println(answer)
    println(hammingDistance)
}