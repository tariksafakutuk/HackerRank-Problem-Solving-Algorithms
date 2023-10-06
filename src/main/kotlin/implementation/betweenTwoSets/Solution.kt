package implementation.betweenTwoSets

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun getTotalX(a: List<Int>, b: List<Int>): Int {
    var total = 0
    var lcm = 1

    while (true) {
        if (lcm > b[0]) {
            break
        }
        var count = a.count { lcm % it == 0 }

        if (count == a.size) {
            count = b.count { it % lcm == 0 }

            if (count == b.size) {
                total += 1
            }
        }

        lcm += 1
    }

    return total
}

fun main() {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val m = firstMultipleInput[1].toInt()

    val arr = readln().trimEnd().split(" ").map { it.toInt() }

    val brr = readln().trimEnd().split(" ").map { it.toInt() }

    val total = getTotalX(arr, brr)

    println(total)
}