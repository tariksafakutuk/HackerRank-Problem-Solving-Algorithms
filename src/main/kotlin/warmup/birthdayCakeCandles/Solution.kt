package warmup.birthdayCakeCandles

/*
 * Complete the 'birthdayCakeCandles' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY candles as parameter.
 */

fun birthdayCakeCandles(candles: List<Int>): Int {
    val tallestCandle = candles.max()

    return candles.count() { it == tallestCandle }
}

fun main() {
    val candlesCount = readln().trim().toInt()

    val candles = readln().trimEnd().split(" ").map { it.toInt() }

    val result = birthdayCakeCandles(candles)

    println(result)
}