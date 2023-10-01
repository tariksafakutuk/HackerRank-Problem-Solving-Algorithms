package warmup.compareTriplets

/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: List<Int>, b: List<Int>): MutableList<Int> {
    val totalPointList = mutableListOf(0, 0)

    for (i in a.indices) {
        if (a[i] > b[i]) {
            totalPointList[0] += 1
        } else if (a[i] < b[i]) {
            totalPointList[1] += 1
        }
    }

    return totalPointList
}

fun main() {
    val a = readln().trimEnd().split(" ").map { it.toInt() }

    val b = readln().trimEnd().split(" ").map { it.toInt() }

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}