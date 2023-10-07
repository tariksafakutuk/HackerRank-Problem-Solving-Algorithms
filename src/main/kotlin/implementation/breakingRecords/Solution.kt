package implementation.breakingRecords

/*
 * Complete the 'breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */

fun breakingRecords(scores: List<Int>): MutableList<Int> {
    var minScore = -1
    var maxScore = -1
    val countList = mutableListOf(0, 0)

    for (score in scores) {
        if (minScore == -1 && maxScore == -1) {
            minScore = score
            maxScore = score
        } else if (score < minScore) {
            minScore = score
            countList[1]++
        } else if (score > maxScore) {
            maxScore = score
            countList[0]++
        }
    }

    return countList
}

fun main() {
    val n = readln().trim().toInt()

    val scores = readln().trimEnd().split(" ").map{ it.toInt() }

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}