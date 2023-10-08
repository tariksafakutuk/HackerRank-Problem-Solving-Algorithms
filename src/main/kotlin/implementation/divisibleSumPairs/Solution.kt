package implementation.divisibleSumPairs

/*
 * Complete the 'divisibleSumPairs' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER k
 *  3. INTEGER_ARRAY ar
 */

fun divisibleSumPairs(n: Int, k: Int, ar: List<Int>): Int {
    var pairCount = 0

    for (i in ar.indices) {
        for (j in (i + 1) until n) {
            if ((ar[i] + ar[j]) % k == 0) {
                pairCount++
            }
        }
    }

    return pairCount
}

fun main() {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val k = firstMultipleInput[1].toInt()

    val ar = readln().trimEnd().split(" ").map { it.toInt() }

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}