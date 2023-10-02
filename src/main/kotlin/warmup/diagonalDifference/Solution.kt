package warmup.diagonalDifference

import kotlin.math.abs

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: MutableList<List<Int>>): Int {
    var leftToRightDiagonal = 0
    var rightToLeftDiagonal = 0

    for (i in arr.indices) {
        leftToRightDiagonal += arr[i][i]
        rightToLeftDiagonal += arr[i][(arr.size - 1) - i]
    }

    return abs(leftToRightDiagonal - rightToLeftDiagonal)
}

fun main() {
    val n = readln().trim().toInt()

    val arr = MutableList(n) { List(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readln().trimEnd().split(" ").map { it.toInt() }
    }

    val result = diagonalDifference(arr)

    println(result)
}