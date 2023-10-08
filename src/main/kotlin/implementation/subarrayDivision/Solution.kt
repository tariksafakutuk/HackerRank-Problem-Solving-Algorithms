package implementation.subarrayDivision

/*
 * Complete the 'birthday' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY s
 *  2. INTEGER d
 *  3. INTEGER m
 */

fun birthday(n: Int, s: List<Int>, d: Int, m: Int): Int {
    var wayCount = 0

    for (i in 0..n - m) {
        val sum = s.slice(i until i + m).sum()

        if (sum == d) {
            wayCount++
        }
    }

    return wayCount
}

fun main() {
    val n = readln().trim().toInt()

    val s = readln().trimEnd().split(" ").map { it.toInt() }

    val firstMultipleInput = readln().trimEnd().split(" ")

    val d = firstMultipleInput[0].toInt()

    val m = firstMultipleInput[1].toInt()

    val result = birthday(n, s, d, m)

    println(result)
}