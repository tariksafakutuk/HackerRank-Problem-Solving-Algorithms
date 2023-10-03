package warmup.miniMaxSum

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: List<Long>) {
    val sumList = mutableListOf<Long>()

    for (i in arr.indices) {
        sumList.add(arr.sum() - arr[i])
    }

    println("${sumList.min()} ${sumList.max()}")
}

fun main() {
    val arr = readln().trimEnd().split(" ").map { it.toLong() }

    miniMaxSum(arr)
}