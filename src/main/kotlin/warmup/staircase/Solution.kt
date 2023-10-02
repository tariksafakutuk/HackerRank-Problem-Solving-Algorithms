package warmup.staircase

/*
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase(n: Int) {
    val space = " "
    val sharp = "#"

    for (i in 1..n) {
        println(space.repeat(n - i) + sharp.repeat(i))
    }
}

fun main() {
    val n = readln().trim().toInt()

    staircase(n)
}