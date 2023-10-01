package warmup.simpleArraySum

/*
 * Complete the 'simpleArraySum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY ar as parameter.
 */

fun simpleArraySum(ar: List<Int>): Int {
    var sum = 0

    for (i in ar){
        sum += i
    }

    return sum
}

fun main() {
    val arCount = readln().trim().toInt()

    val ar = readln().trimEnd().split(" ").map{ it.toInt() }

    val result = simpleArraySum(ar)

    println(result)
}