package warmup.timeConversion

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    val time = if (s[8] == 'P') {
        if (s.split(':')[0].toInt() >= 12) s.subSequence(0, 8).toString()
        else (s.split(':')[0].toInt() + 12).toString() + s.subSequence(2, 8)
    } else {
        if (s.split(':')[0] == "12") "00:${s.subSequence(3, 8)}"
        else s.subSequence(0, 8).toString()
    }

    return time
}

fun main(args: Array<String>) {
    val s = readln()

    val result = timeConversion(s)

    println(result)
}