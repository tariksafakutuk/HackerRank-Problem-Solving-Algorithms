package implementation.appleAndOrange

/*
 * Complete the 'countApplesAndOranges' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER s
 *  2. INTEGER t
 *  3. INTEGER a
 *  4. INTEGER b
 *  5. INTEGER_ARRAY apples
 *  6. INTEGER_ARRAY oranges
 */

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: List<Int>, oranges: List<Int>) {
    val appleCount = apples.count { distance -> (distance + a in s..t) }
    val orangeCount = oranges.count { distance -> (distance + b in s..t) }

    print("$appleCount\n$orangeCount")
}

fun main() {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val s = firstMultipleInput[0].toInt()

    val t = firstMultipleInput[1].toInt()

    val secondMultipleInput = readln().trimEnd().split(" ")

    val a = secondMultipleInput[0].toInt()

    val b = secondMultipleInput[1].toInt()

    val thirdMultipleInput = readln().trimEnd().split(" ")

    val m = thirdMultipleInput[0].toInt()

    val n = thirdMultipleInput[1].toInt()

    val apples = readln().trimEnd().split(" ").map { it.toInt() }

    val oranges = readln().trimEnd().split(" ").map { it.toInt() }

    countApplesAndOranges(s, t, a, b, apples, oranges)
}