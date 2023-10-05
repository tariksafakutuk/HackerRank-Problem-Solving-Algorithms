package implementation.numberLineJumps

import java.lang.Exception

/*
 * Complete the 'kangaroo' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER x1
 *  2. INTEGER v1
 *  3. INTEGER x2
 *  4. INTEGER v2
 */

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    if (v1 < v2) {
        return "NO"
    }

    return try {
        if ((x2 - x1) % (v2 - v1) == 0) {
            "YES"
        } else {
            "NO"
        }
    } catch (e: Exception) {
        "NO"
    }
}

fun main() {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val x1 = firstMultipleInput[0].toInt()

    val v1 = firstMultipleInput[1].toInt()

    val x2 = firstMultipleInput[2].toInt()

    val v2 = firstMultipleInput[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}