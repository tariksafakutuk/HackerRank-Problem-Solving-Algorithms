package warmup.solveMeFirst
import java.util.*

fun solveMeFirst(a: Int, b: Int): Int = a + b

fun main() {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
}