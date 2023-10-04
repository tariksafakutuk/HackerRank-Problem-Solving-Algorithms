package implementation.gradingStudents

/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: MutableList<Int>): MutableList<Int> {
    val finalGrades = mutableListOf<Int>()

    for (i in grades.indices) {
        val round = 5 - grades[i] % 5

        if (round < 3 && grades[i] >= 38) {
            finalGrades.add(grades[i] + round)
        } else {
            finalGrades.add(grades[i])
        }
    }

    return finalGrades
}

fun main() {
    val gradesCount = readln().trim().toInt()

    val grades = mutableListOf<Int>()

    repeat(gradesCount) {
        val gradesItem = readln().trim().toInt()
        grades.add(gradesItem)
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}