package warmup.plusMinus

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: List<Int>) {
    var positiveCount = 0
    var negativeCount = 0
    var zeroCount = 0

    for (i in arr) {
        if (i > 0) {
            positiveCount += 1
        } else if (i < 0) {
            negativeCount += 1
        } else {
            zeroCount += 1
        }
    }

    println("%.6f".format(positiveCount / arr.size.toFloat()))
    println("%.6f".format(negativeCount / arr.size.toFloat()))
    println("%.6f".format(zeroCount / arr.size.toFloat()))
}

fun main() {
    val n = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map { it.toInt() }

    plusMinus(arr)
}