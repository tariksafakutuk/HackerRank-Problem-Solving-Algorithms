package warmup.aVeryBigSum

/*
 * Complete the 'aVeryBigSum' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts LONG_INTEGER_ARRAY ar as parameter.
 */

fun aVeryBigSum(ar: List<Long>): Long {
    var sum: Long = 0

    for (i in ar) {
        sum += i
    }

    return sum
}

fun main() {
    val arCount = readln().trim().toInt()

    val ar = readln().trimEnd().split(" ").map { it.toLong() }

    val result = aVeryBigSum(ar)

    println(result)
}