package Silver

/**
 * https://www.acmicpc.net/problem/1064
 * 1064_평행사변형 (S5)
 */

import java.util.*
import java.util.Collections.max
import java.util.Collections.min
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

private val st = StringTokenizer(readLine())

fun available(x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int) =
    (x1 - x2) * (y1 - y3) != (y1 - y2) * (x1 - x3)

fun getLength(x1: Int, y1: Int, x2: Int, y2: Int) =
    sqrt(abs((x2 - x1).toDouble().pow(2) + (y2 - y1).toDouble().pow(2)))

fun main() = with(System.`in`.bufferedReader()) {
    val xa = Integer.parseInt(st.nextToken())
    val ya = Integer.parseInt(st.nextToken())
    val xb = Integer.parseInt(st.nextToken())
    val yb = Integer.parseInt(st.nextToken())
    val xc = Integer.parseInt(st.nextToken())
    val yc = Integer.parseInt(st.nextToken())

    if (available(xa, ya, xb, yb, xc, yc)) {
        val ab = getLength(xa, ya, xb, yb)
        val ac = getLength(xa, ya, xc, yc)
        val bc = getLength(xb, yb, xc, yc)
        print(2 * (max(listOf(ab, ac, bc)) - min(listOf(ab, ac, bc))))

    } else {
        print(-1.0)
    }
}