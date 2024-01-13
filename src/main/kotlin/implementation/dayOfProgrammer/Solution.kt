package implementation.dayOfProgrammer

/*
 * Complete the 'dayOfProgrammer' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER year as parameter.
 */

fun dayOfProgrammer(year: Int): String {
    return if (year == 1918) {
        "26.09.1918"
    } else if (((year <= 1917) && (year % 4 == 0)) || ((year > 1918) && (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))))) {
        String.format("12.09.%s", year)
    } else {
        String.format("13.09.%s", year)
    }
}

fun main(args: Array<String>) {
    val year = readln().trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}